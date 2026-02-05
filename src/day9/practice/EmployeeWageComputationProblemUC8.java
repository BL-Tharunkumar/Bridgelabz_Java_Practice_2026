package day9.practice;

public class EmployeeWageComputationProblemUC8 {
    public static final int FULL_TIME_EMPLOYEE = 1;
    public static final int PART_TIME_EMPLOYEE = 2;

    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;

    public static int isEmployeePresent() {
        return (int) (Math.random() * 3);
    }

    public static int calculateEmployeeWorkingHours(int isEmployeePresent) {
        switch (isEmployeePresent) {
            case FULL_TIME_EMPLOYEE:
                return FULL_DAY_HOUR;
            case PART_TIME_EMPLOYEE:
                return PART_TIME_HOUR;
            default:
                return 0;
        }
    }

    public static double calculateWage(int workingHours, int employeeWage) {
        return workingHours * employeeWage;
    }

    private static void calculateEmployeeWage(String companyName, int employeeWage, int maxWorkingDays, int maxWorkingHours) {
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingHours < maxWorkingHours && totalWorkingDays < maxWorkingDays) {

            totalWorkingDays++;
            int employeeType = isEmployeePresent();
            int dailyHours = calculateEmployeeWorkingHours(employeeType);

            if (totalWorkingHours + dailyHours > maxWorkingHours) {
                break;
            }
            totalWorkingHours += dailyHours;
        }

        double totalMonthlyWage = calculateWage(totalWorkingHours, employeeWage);
        System.out.println("Monthly wage of " + companyName + ": " + totalMonthlyWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        calculateEmployeeWage("TCS", 20, 20, 100);
        calculateEmployeeWage("Zoho", 30, 18, 80);
        calculateEmployeeWage("FA", 5, 35, 150);
    }
}
