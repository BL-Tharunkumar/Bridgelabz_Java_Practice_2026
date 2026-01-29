package day3.practice;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Line_Comparison_Problem {
    public static void main(String[] args) {
//        As a fan of geometry, I want to model a line based on a point consisting of (x, y) co -ordinates using the Cartesian system,
//        So that I can calculate its length. - A Length as 2 Points (x1, y1) and (x2, y2) - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2
//                - y1) ^ 2)


        Scanner sc = new Scanner(System.in);

        // Line 1 input
        System.out.println("Enter coordinates for Line 1:");
        System.out.print("x1: ");
        int x1 = sc.nextInt();
        System.out.print("y1: ");
        int y1 = sc.nextInt();
        System.out.print("x2: ");
        int x2 = sc.nextInt();
        System.out.print("y2: ");
        int y2 = sc.nextInt();

        // Line 2 input
        System.out.println("\nEnter coordinates for Line 2:");
        System.out.print("x3: ");
        int x3 = sc.nextInt();
        System.out.print("y3: ");
        int y3 = sc.nextInt();
        System.out.print("x4: ");
        int x4 = sc.nextInt();
        System.out.print("y4: ");
        int y4 = sc.nextInt();

        // Calculate length of Line 1
        Double length1 = sqrt(
                (x2 - x1) * (x2 - x1) +
                        (y2 - y1) * (y2 - y1)
        );

        // Calculate length of Line 2
        Double length2 = sqrt(
                (x4 - x3) * (x4 - x3) +
                        (y4 - y3) * (y4 - y3)
        );

        // Check equality using equals()
        if (length1.equals(length2)) {
            System.out.println("\nBoth lines are equal");
        } else {
            System.out.println("\nBoth lines are NOT equal");
        }


        int result = length1.compareTo(length2);

        System.out.println(result);

        if (result == 0) {
            System.out.println("\nBoth lines are EQUAL");
        } else if (result > 0) {
            System.out.println("\nLine 1 is GREATER than Line 2");
        } else {
            System.out.println("\nLine 1 is LESS than Line 2");
        }

        sc.close();
    }
}
