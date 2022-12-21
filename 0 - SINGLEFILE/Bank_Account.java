class BankAccount {
    private int    acccountNumber;
    private String name;
    private double balance;

    public BankAccount(int acccountNumber, String name, double balance) {
        this.acccountNumber = acccountNumber;
        this.name           = name;
        this.balance        = balance;
    }
    public void deposit (double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void bankFees() {
        balance = balance - balance * 0.05;
    }
    public void display() {
        System.out.println("Account Number: " + acccountNumber);
        System.out.println("Name:           " + name);
        System.out.println("Balance:        " + balance);
    }
}
public class Bank_Account {
    public static void main(String[] args) {
        BankAccount bankaccount1 = new BankAccount(23102002, "Duong Phi", 1000);
        bankaccount1.display();
        bankaccount1.deposit(500);
        bankaccount1.withdraw(200);
        bankaccount1.bankFees();
        System.out.println("");
        System.out.println("After Change: ");
        bankaccount1.display();
    }
}