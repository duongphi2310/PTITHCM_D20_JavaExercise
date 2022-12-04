public class BankAccount {
    private int    accountNumber;
    private String name;
    private double balance;
    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name          = name;
        this.balance       = balance;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdrawal(double amount) {
        if (balance < amount) {
            System.out.println("Not Enough Balance In Account !!!");
        }
        else
        balance = balance - amount;
    }
    public void bankFees() {
        balance = balance * 0.95;
    }
    public void display() {
        System.out.println("ACCOUNT Number : " + accountNumber);
        System.out.println("ACCOUNT Name   : " + name);
        System.out.println("ACCOUNT Balance: " + balance);
    }
}