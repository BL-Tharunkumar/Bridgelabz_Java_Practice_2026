package Day11_12.practice.stock_account_mangement;

import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock s) {
        stocks.add(s);
    }

    public double getTotalValue() {
        double total = 0;
        for (Stock s : stocks) total += s.getValue();
        return total;
    }

    public void printReport() {
        System.out.printf("%-20s %10s %12s %15s%n", "Stock Name", "Shares", "Price ($)", "Value ($)");
        System.out.println("-".repeat(60));
        for (Stock s : stocks) {
            System.out.printf("%-20s %10d %12.2f %15.2f%n",
                    s.getName(), s.getNumberOfShares(), s.getSharePrice(), s.getValue());
        }
        System.out.println("-".repeat(60));
        System.out.printf("%-44s %15.2f%n", "TOTAL PORTFOLIO VALUE:", getTotalValue());
    }
}
