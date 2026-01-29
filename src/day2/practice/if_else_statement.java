package day2.practice;

import java.util.Scanner;

public class if_else_statement {
    public static void main(String[] args) {

        // Use only ONE Scanner
        Scanner sc = new Scanner(System.in);

        // ----------- Example 1 -----------
        System.out.print("Enter a single digit number (0 to 9): ");
        int num = sc.nextInt();

        if (num == 0)
            System.out.println("Zero");
        else if (num == 1)
            System.out.println("One");
        else if (num == 2)
            System.out.println("Two");
        else if (num == 3)
            System.out.println("Three");
        else if (num == 4)
            System.out.println("Four");
        else if (num == 5)
            System.out.println("Five");
        else if (num == 6)
            System.out.println("Six");
        else if (num == 7)
            System.out.println("Seven");
        else if (num == 8)
            System.out.println("Eight");
        else if (num == 9)
            System.out.println("Nine");
        else
            System.out.println("Invalid input! Please enter a single digit.");

        // ----------- Example 2 -----------
        System.out.print("\nEnter a number (1, 10, 100, 1000): ");
        int number = sc.nextInt();

        if (number == 1)
            System.out.println("Unit");
        else if (number == 10)
            System.out.println("Ten");
        else if (number == 100)
            System.out.println("Hundred");
        else if (number == 1000)
            System.out.println("Thousand");
        else
            System.out.println("Invalid number! Please enter 1, 10, 100, or 1000.");

        // Close scanner at the END
        sc.close();
    }
}
