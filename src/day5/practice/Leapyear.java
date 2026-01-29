package day5.practice;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-Digit number to check a leap year:  ");

        int year = sc.nextInt();

        if(year < 1000 || year > 9999){
            System.out.println("Enter a valid 4-digit numbers");
        }
        else {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }

        sc.close();
    }
}
