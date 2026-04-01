package Day11_12.practice.stock_account_mangement;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double initialBalance) {
        this.name = name;
        this.balance = (initialBalance >= 0) ? initialBalance : 0;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() { return balance; }
    public String getName()    { return name; }
}
