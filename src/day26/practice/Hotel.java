package day26.practice;

public class Hotel {

    private String name;
    private int rating;

    private int regularWeekdayRate;
    private int regularWeekendRate;

    private int rewardWeekdayRate;
    private int rewardWeekendRate;

    public Hotel(String name, int rating,
                 int regularWeekdayRate,
                 int regularWeekendRate,
                 int rewardWeekdayRate,
                 int rewardWeekendRate) {

        this.name = name;
        this.rating = rating;
        this.regularWeekdayRate = regularWeekdayRate;
        this.regularWeekendRate = regularWeekendRate;
        this.rewardWeekdayRate = rewardWeekdayRate;
        this.rewardWeekendRate = rewardWeekendRate;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int calculateRate(int weekdays,
                             int weekends,
                             String customerType) {

        if (customerType.equalsIgnoreCase("Reward")) {

            return (weekdays * rewardWeekdayRate)
                    + (weekends * rewardWeekendRate);
        }

        return (weekdays * regularWeekdayRate)
                + (weekends * regularWeekendRate);
    }
}
