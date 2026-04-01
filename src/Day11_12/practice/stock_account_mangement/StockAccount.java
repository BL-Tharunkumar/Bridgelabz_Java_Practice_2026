package Day11_12.practice.stock_account_mangement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class CompanyShares {
    private String stockSymbol;
    private int numberOfShares;
    private LocalDateTime transactionTime;

    public CompanyShares(String stockSymbol, int numberOfShares) {
        this.stockSymbol = stockSymbol;
        this.numberOfShares = numberOfShares;
        this.transactionTime = LocalDateTime.now();
    }

    public String getStockSymbol() { return stockSymbol; }
    public int getNumberOfShares() { return numberOfShares; }
    public void setNumberOfShares(int n) {
        this.numberOfShares = n;
        this.transactionTime = LocalDateTime.now();
    }
    public LocalDateTime getTransactionTime() { return transactionTime; }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("Symbol: %-6s | Shares: %5d | Last Transaction: %s",
                stockSymbol, numberOfShares, transactionTime.format(fmt));
    }
}

public class StockAccount {
    private String accountId;
    private String customerName;
    private double cashBalance;
    private List<CompanyShares> holdings = new ArrayList<>();

    public StockAccount(String accountId, String customerName, double cashBalance) {
        this.accountId = accountId;
        this.customerName = customerName;
        this.cashBalance = cashBalance;
    }

    // Buy shares: deduct cash, add/update CompanyShares
    public void buy(String symbol, int qty, double pricePerShare) {
        double cost = qty * pricePerShare;
        if (cost > cashBalance) {
            System.out.println("Insufficient funds to buy " + qty + " shares of " + symbol);
            return;
        }
        cashBalance -= cost;
        CompanyShares existing = findHolding(symbol);
        if (existing != null) {
            existing.setNumberOfShares(existing.getNumberOfShares() + qty);
        } else {
            holdings.add(new CompanyShares(symbol, qty));
        }
        System.out.printf("Bought %d shares of %s @ $%.2f each. Cash remaining: $%.2f%n",
                qty, symbol, pricePerShare, cashBalance);
    }

    // Sell shares: check availability, update/remove CompanyShares, credit cash
    public void sell(String symbol, int qty, double pricePerShare) {
        CompanyShares existing = findHolding(symbol);
        if (existing == null || existing.getNumberOfShares() < qty) {
            System.out.println("Insufficient shares to sell " + qty + " of " + symbol);
            return;
        }
        int remaining = existing.getNumberOfShares() - qty;
        if (remaining == 0) holdings.remove(existing);
        else existing.setNumberOfShares(remaining);
        cashBalance += qty * pricePerShare;
        System.out.printf("Sold %d shares of %s @ $%.2f each. Cash balance: $%.2f%n",
                qty, symbol, pricePerShare, cashBalance);
    }

    private CompanyShares findHolding(String symbol) {
        for (CompanyShares cs : holdings)
            if (cs.getStockSymbol().equalsIgnoreCase(symbol)) return cs;
        return null;
    }

    public void printStatement() {
        System.out.println("\n===== STOCK ACCOUNT STATEMENT =====");
        System.out.println("Account ID : " + accountId);
        System.out.println("Customer   : " + customerName);
        System.out.printf("Cash Balance: $%.2f%n", cashBalance);
        System.out.println("Holdings:");
        if (holdings.isEmpty()) {
            System.out.println("  (No holdings)");
        } else {
            for (CompanyShares cs : holdings) System.out.println("  " + cs);
        }
        System.out.println("===================================");
    }

    public static void main(String[] args) {
        StockAccount sa = new StockAccount("ACC001", "Bob Smith", 10000.00);
        sa.printStatement();

        sa.buy("AAPL", 10, 175.50);
        sa.buy("TSLA", 5, 240.00);
        sa.buy("GOOG", 2, 2800.00);   // should fail - insufficient funds
        sa.printStatement();

        sa.sell("AAPL", 4, 180.00);
        sa.sell("TSLA", 10, 250.00);  // should fail - not enough shares
        sa.printStatement();
    }
}
