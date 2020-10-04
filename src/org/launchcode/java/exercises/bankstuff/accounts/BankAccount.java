package accounts;

public class BankAccount {

    private int accountNo;
    private double balance;
    public BankAccount(int accountNo) {
       this.accountNo = accountNo;
       this.balance = 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return this.balance;
    }

}
