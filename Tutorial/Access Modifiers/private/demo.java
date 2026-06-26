

public class demo {
    public static void main(String args[]){
        Bank b = new Bank();

        // b.balance = 10000;  // not accessible
        // b.show();  // not accessible


        b.setBalance(4100);
        System.out.println("Balance = "+b.getBalance());
    }
    
}


class Bank{
    private double balance = 1000;

    private void show(){
        System.out.println("Balance = "+balance);
    }




    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }


}
