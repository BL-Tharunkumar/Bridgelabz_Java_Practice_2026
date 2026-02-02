package day8.practice;

public class EmployeeWageComputation {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch\n");

        int wage_per_hour = 20;
        int full_day_hour = 8;
        int part_time_hour = 4;
        int working_day_permonth = 20;

        int totalWage = 0;
        int totalWorkingHours = 0;

        int present = 0;
        int absent = 0;

        for (int day = 1; day <= working_day_permonth; day++) {

            // 0 = Absent, 1 = Part Time, 2 = Full Time
            int randomInt = (int) (Math.random() * 3);
            int workingHours = 0;

            switch (randomInt) {
                case 1:
                    workingHours = part_time_hour;
                    present++;
                    System.out.println("Day " + day + ": Part Time Employee");
                    break;

                case 2:
                    workingHours = full_day_hour;
                    present++;
                    System.out.println("Day " + day + ": Full Time Employee");
                    break;

                default:
                    workingHours = 0;
                    absent++;
                    System.out.println("Day " + day + ": Employee Absent");
            }

            int dailyWage = workingHours * wage_per_hour;
            totalWage += dailyWage;
            totalWorkingHours += workingHours;
        }

        System.out.println("\nTotal Working Days: " + working_day_permonth);
        System.out.println("Total Present Days: " + present);
        System.out.println("Total Absent Days: " + absent);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Monthly Wage: " + totalWage);
    }
}
