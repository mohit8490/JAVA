

public class demo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.withdraw(300);

        System.out.println(ba.getBalance());
    }
}

class BankAccount {
    private double balance;

    public void deposit(int amount) {
        if(amount < 0){
            System.out.println("Amount is not acceptable");
        }else{
            balance += amount;
        }
        
    }

    public void withdraw(int amount) {
       if(amount > balance){
            System.out.println("Not enough Money");
       }else{
            balance -= amount;
       }  
    }

    // getters
    public double getBalance() {
        return balance;
    }
    
    // Setters
    void setbalance(double balance){
        this.balance = balance;
    }
}

class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String college;

    Student(String name, int rollNumber, int age, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        // Validations --> college should be real.
        this.college = college;
    }
}