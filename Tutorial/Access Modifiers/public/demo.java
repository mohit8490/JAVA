

public class demo {
    public static void main(String args[]){
        BankAccount b = new BankAccount();
        b.balance = 10000;      // accessible
        b.show();               // accessible
    }
}


class BankAccount{
    public double balance;

    public double show(){
        return balance;
    }
}