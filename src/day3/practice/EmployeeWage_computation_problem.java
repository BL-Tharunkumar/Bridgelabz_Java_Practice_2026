package day3.practice;

import java.util.Scanner;

public class EmployeeWage_computation_problem {
    private  static final int wage_perhr = 20;
    public static void main(String[] args) {

        //        Check Employee is
        //        Present or Absent
        //                - Use ((RANDOM)) for Attendance
        //                Check
        int attendance = (int)(Math.random() * 2);

        if (attendance == 1){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is Absent");
        }

        //        Calculate Daily Employee Wage assume Wage per hour is 20 , assume full day hour is 8

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Hour in an Number the person is worked with Full-time:  ");

        int number = sc.nextInt();

        System.out.print("Enter an Hour in an Number the person is worked with Part-time:  ");
        int parttime_number = sc.nextInt();


        int full_dayhr = 8;

        int totalmoney;

        if (number >= 0 && number <= full_dayhr){

            totalmoney = number * wage_perhr;
            System.out.println("The totalmoney calculated by your Working hours is(Full-time): " +  totalmoney);
        }
        else {
            System.out.println("Give the input hours  between 8hrs");

        }

        //        Add Part time
        //        Employee & Wage
        //                - Assume Part time Hour is 8

        full_dayhr = 4;


        if (parttime_number >= 0 && parttime_number <= full_dayhr){

            totalmoney = parttime_number * wage_perhr;
            System.out.println("The totalmoney calculated by your Working hours is(Part-time): " +  totalmoney);
        }
        else {
            System.out.println("Give the input hours  between 4hrs");

        }

        //        Calculating Wages for a Month  - Assume 20 Working Day per Month
        int working_days_per_month = 20;
        int calculating_wages_per_month = 8 * 20 * working_days_per_month;

        System.out.println("Total wages per month: " +  calculating_wages_per_month);


        // Calculate Wages till a condition of total working hours or days is reached
// Assume 100 hours and 20 days

        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        int maxWorkingHours = 100;
        int maxWorkingDays = 20;

        int dailyHours;
        int dailyWage;

        while (totalWorkingHours < maxWorkingHours && totalWorkingDays < maxWorkingDays) {

            totalWorkingDays++;

            // Generate random attendance
            int empCheck = (int)(Math.random() * 3); // 0,1,2

            switch (empCheck) {
                case 1:
                    dailyHours = 8; // Full-time
                    break;

                case 2:
                    dailyHours = 4; // Part-time
                    break;

                default:
                    dailyHours = 0; // Absent
            }

            // Avoid exceeding 100 hours
            if (totalWorkingHours + dailyHours > maxWorkingHours) {
                dailyHours = maxWorkingHours - totalWorkingHours;
            }

            dailyWage = dailyHours * wage_perhr;

            totalWorkingHours += dailyHours;

            System.out.println("Day " + totalWorkingDays +
                    " | Hours Worked: " + dailyHours +
                    " | Daily Wage: " + dailyWage);
        }

        int totalMonthlyWage = totalWorkingHours * wage_perhr;

        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Monthly Wage: " + totalMonthlyWage);




        sc.close();



    }
}
