package day2.practice;

import java.util.Scanner;

public class operatorsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1. Enter two numbers and do the following arithmetic Operations find max and min.
        System.out.print("Enter value of  a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of  b:  ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        int result1 = a+b*c;
        int result2 = c+a/b;
        int result3 = a%b+c;
        int result4 = a*b+c;

        int max = result1;
        if(result2 > max) max = result2;
        if (result3 > max) max = result3;
        if(result4 > max) max = result4;

        int min = result1;
        if(result2 < min) min = result2;
        if (result3 < min) min = result3;
        if(result4 < min) min = result4;

        // Output results
        System.out.println("\nResults:");
        System.out.println("a + b * c = " + result1);
        System.out.println("c + a / b = " + result2);
        System.out.println("a % b + c = " + result3);
        System.out.println("a * b + c = " + result4);

        System.out.println("\nMaximum Value = " + max);
        System.out.println("Minimum Value = " + min);

//        2. Write a program SpringSeason.java that takes two int values m and d from the command line and prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
        System.out.print("Enter the Month  :  ");
        int m = sc.nextInt();

        System.out.print("Enter the Day  :  ");
        int d = sc.nextInt();

        boolean isSpring = false;

        if ((m == 3 && d >= 20) ||
                (m == 4) ||
                (m == 5) ||
                (m == 6 && d <= 20)) {
            isSpring = true;
        }

        System.out.println(isSpring);

//        3. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//                Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
//        Root 1 of x = (-b + sqrt(delta))/(2*a)
//        Root 2 of x = (-b - sqrt(delta))/(2*a)

        System.out.print("Enter value of  a: ");
        double double_a = sc.nextDouble();
        System.out.print("Enter value of  b: ");
        double double_b = sc.nextDouble();
        System.out.print("Enter value of  c: ");
        double double_c = sc.nextDouble();

        // Calculate delta
        double delta = double_b * double_b - 4 * double_a * double_c;

        // Calculate roots
        double root1 = (-double_b + Math.sqrt(delta)) / (2 * double_a);
        double root2 = (-double_b - Math.sqrt(delta)) / (2 * double_a);

        // Output
        System.out.println("Root 1 = " + root1);
        System.out.println("Root 2 = " + root2);


//        4. Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function

        System.out.println("Enter X");
        int x = sc.nextInt();

        System.out.println("Enter Y");
        int y = sc.nextInt();

        // Calculate distance
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // Output
        System.out.println("Euclidean Distance = " + distance);


        sc.close();


    }
}
