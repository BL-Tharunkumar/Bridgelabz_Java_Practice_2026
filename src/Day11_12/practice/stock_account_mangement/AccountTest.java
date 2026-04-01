package Day11_12.practice.stock_account_mangement;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account("Alice", 1000.00);

        System.out.println("Account: " + acc.getName());
        System.out.printf("Initial Balance: $%.2f%n", acc.getBalance());

        System.out.println("\n-- Crediting $500 --");
        acc.credit(500);
        System.out.printf("Balance after credit: $%.2f%n", acc.getBalance());

        System.out.println("\n-- Debiting $200 --");
        acc.debit(200);
        System.out.printf("Balance after debit: $%.2f%n", acc.getBalance());

        System.out.println("\n-- Attempting to debit $2000 (exceeds balance) --");
        acc.debit(2000);
        System.out.printf("Balance unchanged: $%.2f%n", acc.getBalance());
    }
}
