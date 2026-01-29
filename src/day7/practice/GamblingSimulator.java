package day7.practice;

import java.util.Random;

public class GamblingSimulator {
    public static void main(String[] args) {

        final int DAYS_IN_MONTH = 20;
        final int INITIAL_STAKE = 100;
        final int BET_AMOUNT = 1;
        final int GOAL = 150;
        final int LOSS_LIMIT = 50;

        Random random = new Random();

        int totalProfit = 0;
        int daysWon = 0;
        int daysLost = 0;

        int luckiestDay = 0;
        int unluckiestDay = 0;
        int maxWin = Integer.MIN_VALUE;
        int maxLoss = Integer.MAX_VALUE;

        for (int day = 1; day <= DAYS_IN_MONTH; day++) {

            int stake = INITIAL_STAKE;

            while (stake > LOSS_LIMIT && stake < GOAL) {
                if (random.nextInt(2) == 1) {
                    stake += BET_AMOUNT;
                } else {
                    stake -= BET_AMOUNT;
                }
            }

            int dailyResult = stake - INITIAL_STAKE;
            totalProfit += dailyResult;

            if (dailyResult > 0) {
                daysWon++;
                if (dailyResult > maxWin) {
                    maxWin = dailyResult;
                    luckiestDay = day;
                }
            } else {
                daysLost++;
                if (dailyResult < maxLoss) {
                    maxLoss = dailyResult;
                    unluckiestDay = day;
                }
            }
        }

        // UC 4 Output
        System.out.println("Total amount after 20 days: " + totalProfit);

        // UC 5 Output
        System.out.println("Days Won: " + daysWon);
        System.out.println("Days Lost: " + daysLost);

        // UC 6 Output
        System.out.println("Luckiest Day: Day " + luckiestDay + " with profit " + maxWin);
        System.out.println("Unluckiest Day: Day " + unluckiestDay + " with loss " + maxLoss);

        // UC 7 Decision
        if (totalProfit > 0) {
            System.out.println("Gambler won this month and will continue gambling next month.");
        } else {
            System.out.println("Gambler lost this month and will stop gambling.");
        }
    }
}
