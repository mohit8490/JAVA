class ATM {

    public void withdrawMoney(int amount) {
        verifyPin();
        checkBalance();
        dispenseCash(amount);

        System.out.println("Please collect your cash.");
    }

    private void verifyPin() {
        System.out.println("PIN Verified");
    }

    private void checkBalance() {
        System.out.println("Balance Checked");
    }

    private void dispenseCash(int amount) {
        System.out.println(amount + " Dispensed");
    }
}

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.withdrawMoney(500);
    }
}