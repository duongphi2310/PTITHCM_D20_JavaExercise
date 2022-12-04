public class Main {
    public static void main (String[] args) {
        BankAccount bank1 = new BankAccount(123456, "John", 3000);
        bank1.display();

        bank1.withdrawal(500);
        bank1.deposit(200);
        System.out.println("\nAfter Change: ");
        bank1.display();
    }
}