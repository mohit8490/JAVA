import java.sql.*;
import java.util.Scanner;

// ================= DB CONNECTION =================
class DB {
    static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/atm_system",
            "root",
            "your_password" // <-- Replace with your MySQL password
        );
    }
}

// ================= USER SERVICES =================
class UserService {
    static final double DAILY_LIMIT = 20000;

    static boolean login(int cid, int pin) throws Exception {
        PreparedStatement ps = DB.getConnection().prepareStatement(
            "SELECT * FROM users WHERE cid=? AND pin=? AND status='ACTIVE'"
        );
        ps.setInt(1, cid);
        ps.setInt(2, pin);
        return ps.executeQuery().next();
    }

    static void deposit(int cid, double amt) throws Exception {
        Connection con = DB.getConnection();
        con.prepareStatement("UPDATE users SET balance=balance+"+amt+" WHERE cid="+cid).execute();
        con.prepareStatement("INSERT INTO transactions(cid,type,amount) VALUES("+cid+",'DEPOSIT',"+amt+")").execute();
        con.prepareStatement("UPDATE bank SET bank_balance=bank_balance+"+amt+", total_transactions=total_transactions+1").execute();
        System.out.println("Deposit Successful");
    }

    static void withdraw(int cid, double amt) throws Exception {
        Connection con = DB.getConnection();
        ResultSet rs = con.prepareStatement(
            "SELECT balance,daily_withdraw FROM users WHERE cid="+cid
        ).executeQuery();

        if (rs.next()) {
            double bal = rs.getDouble(1);
            double dw = rs.getDouble(2);

            if (amt > bal) {
                System.out.println("Insufficient Balance");
                return;
            }
            if (dw + amt > DAILY_LIMIT) {
                System.out.println("Daily Withdraw Limit Exceeded");
                return;
            }

            con.prepareStatement(
                "UPDATE users SET balance=balance-"+amt+", daily_withdraw=daily_withdraw+"+amt+" WHERE cid="+cid
            ).execute();

            con.prepareStatement(
                "INSERT INTO transactions(cid,type,amount) VALUES("+cid+",'WITHDRAW',"+amt+")"
            ).execute();

            con.prepareStatement(
                "UPDATE bank SET bank_balance=bank_balance-"+amt+", total_transactions=total_transactions+1"
            ).execute();

            System.out.println("Withdraw Successful");
        }
    }

    static void changePin(int cid, int newPin) throws Exception {
        if (newPin < 1000 || newPin > 9999) {
            System.out.println("PIN must be exactly 4 digits");
            return;
        }
        DB.getConnection().prepareStatement(
            "UPDATE users SET pin="+newPin+" WHERE cid="+cid
        ).execute();
        System.out.println("PIN Changed Successfully");
    }

    static void history(int cid) throws Exception {
        ResultSet rs = DB.getConnection().prepareStatement(
            "SELECT * FROM transactions WHERE cid="+cid
        ).executeQuery();

        System.out.println("\nID | TYPE | AMOUNT | DATE");
        while (rs.next()) {
            System.out.println(
                rs.getInt(1)+" | "+rs.getString(3)+" | "+rs.getDouble(4)+" | "+rs.getTimestamp(5)
            );
        }
    }
}

// ================= MANAGER SERVICES =================
class ManagerService {

    static boolean login(int id, String pass) throws Exception {
        ResultSet rs = DB.getConnection().prepareStatement(
            "SELECT * FROM manager WHERE mid="+id+" AND password='"+pass+"'"
        ).executeQuery();
        return rs.next();
    }

    // ONLY MANAGER CAN CREATE ACCOUNT
    static void createAccount() throws Exception {
        Scanner sc = new Scanner(System.in);
        Connection con = DB.getConnection();

        System.out.print("Enter New Customer ID: ");
        int cid = sc.nextInt();
        sc.nextLine();

        // DUPLICATE CID CHECK
        ResultSet rs = con.prepareStatement(
            "SELECT cid FROM users WHERE cid="+cid
        ).executeQuery();
        if (rs.next()) {
            System.out.println("CID already exists");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Set 4-digit PIN: ");
        int pin = sc.nextInt();
        if (pin < 1000 || pin > 9999) {
            System.out.println("PIN must be exactly 4 digits");
            return;
        }

        System.out.print("Initial Deposit: ");
        double bal = sc.nextDouble();

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO users(cid,cname,pin,balance,status,daily_withdraw) VALUES(?,?,?,?,?,?)"
        );
        ps.setInt(1, cid);
        ps.setString(2, name);
        ps.setInt(3, pin);
        ps.setDouble(4, bal);
        ps.setString(5, "ACTIVE");
        ps.setDouble(6, 0);

        ps.executeUpdate();
        System.out.println("Account Created Successfully");
    }

    static void blockUser(int cid) throws Exception {
        DB.getConnection().prepareStatement(
            "UPDATE users SET status='BLOCKED' WHERE cid="+cid
        ).execute();
        System.out.println("User Blocked");
    }

    static void viewUsers() throws Exception {
        ResultSet rs = DB.getConnection().prepareStatement(
            "SELECT cid,cname,balance,status,created_at FROM users"
        ).executeQuery();

        System.out.println("\nCID | NAME | BAL | STATUS | CREATED");
        while (rs.next()) {
            System.out.println(
                rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getDouble(3)+" | "+
                rs.getString(4)+" | "+rs.getTimestamp(5)
            );
        }
    }

    static void bankStatus() throws Exception {
        ResultSet rs = DB.getConnection().prepareStatement(
            "SELECT * FROM bank"
        ).executeQuery();
        if (rs.next()) {
            System.out.println("Bank Balance: "+rs.getDouble(1));
            System.out.println("Total Transactions: "+rs.getInt(2));
        }
    }
}

// ================= MULTITHREADING =================
class ATMThread extends Thread {
    int cid, pin;
    ATMThread(int cid, int pin) {
        this.cid = cid;
        this.pin = pin;
    }
    public void run() {
        try {
            if (UserService.login(cid, pin)) {
                UserService.deposit(cid, 500);
            }
        } catch (Exception e) {}
    }
}

// ================= MAIN =================
public class ATMSystem {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. User Login");
        System.out.println("2. Manager Login");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.print("CID: ");
            int cid = sc.nextInt();
            System.out.print("PIN: ");
            int pin = sc.nextInt();

            if (UserService.login(cid, pin)) {
                while (true) {
                    System.out.println("\n1.Deposit\n2.Withdraw\n3.History\n4.Change PIN\n5.Exit");
                    int c = sc.nextInt();
                    if (c == 1) UserService.deposit(cid, sc.nextDouble());
                    else if (c == 2) UserService.withdraw(cid, sc.nextDouble());
                    else if (c == 3) UserService.history(cid);
                    else if (c == 4) UserService.changePin(cid, sc.nextInt());
                    else break;
                }
            } else {
                System.out.println("Invalid Login");
            }
        }

        else if (ch == 2) {
            System.out.print("Manager ID: ");
            int id = sc.nextInt();
            System.out.print("Password: ");
            String pass = sc.next();

            if (ManagerService.login(id, pass)) {
                while (true) {
                    System.out.println("\n1.Create Account\n2.View Users\n3.Block User\n4.Bank Status\n5.Exit");
                    int c = sc.nextInt();
                    if (c == 1) ManagerService.createAccount();
                    else if (c == 2) ManagerService.viewUsers();
                    else if (c == 3) ManagerService.blockUser(sc.nextInt());
                    else if (c == 4) ManagerService.bankStatus();
                    else break;
                }
            } else {
                System.out.println("Invalid Manager Login");
            }
        }
    }
}
