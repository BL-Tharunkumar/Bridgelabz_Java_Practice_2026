package Day11_12.practice.stock_account_mangement;

import java.util.Scanner;

public class StockMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("--- Stock " + i + " ---");
            System.out.print("  Name: ");
            String name = sc.nextLine();
            System.out.print("  Number of shares: ");
            int shares = sc.nextInt();
            System.out.print("  Share price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            portfolio.addStock(new Stock(name, shares, price));
        }

        System.out.println("\n========== STOCK REPORT ==========");
        portfolio.printReport();
        sc.close();
    }
}
