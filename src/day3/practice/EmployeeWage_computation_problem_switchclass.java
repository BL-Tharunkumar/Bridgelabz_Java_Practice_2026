package day3.practice;

import java.util.Scanner;

public class EmployeeWage_computation_problem_switchclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wage_perhr = 20;
        int totalmoney;

        System.out.println("Select Work Type:");
        System.out.println("1. Full-time");
        System.out.println("2. Part-time");

        int choice = sc.nextInt();

        switch (choice){
            case 1:

                System.out.print("Enter working hours (0 to 8): ");
                int fullTimeHours = sc.nextInt();

                if (fullTimeHours >= 0 && fullTimeHours <= 8) {
                    totalmoney = fullTimeHours * wage_perhr;
                    System.out.println("Total money (Full-time): " + totalmoney);
                } else {
                    System.out.println("Give the input hours between 0 to 8");
                }
                break;

            case 2:
                System.out.print("Enter working hours (0 to 4): ");
                int partTimeHours = sc.nextInt();

                if (partTimeHours >= 0 && partTimeHours <= 4) {
                    totalmoney = partTimeHours * wage_perhr;
                    System.out.println("Total money (Part-time): " + totalmoney);
                } else {
                    System.out.println("Give the input hours between 0 to 4");
                }
                break;

            default:
                System.out.println("Invalid choice");

        }

    }
}
