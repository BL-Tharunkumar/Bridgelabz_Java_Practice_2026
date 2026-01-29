package day5.practice;

import java.util.Scanner;

public class QotientRemainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Number: ");
        int number = sc.nextInt();

        System.out.print("Enter an Divisor: ");
        int Divisor = sc.nextInt();

        int qotient = number / Divisor;
        int remainder = number % Divisor;

        System.out.println("qotient is: " + qotient);
        System.out.println("Remainder is: " + remainder);

        sc.close();



    }
}
