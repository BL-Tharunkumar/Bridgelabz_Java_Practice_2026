package day6.practice;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter some digits of number to reverse: " );
        int num = sc.nextInt();
        int reverse = 0;

        while (num != 0){
            int remainder = num % 10; // get last digit
            reverse = reverse * 10 + remainder; // build a reverse
            num = num / 10; // remove the last digit
        }

        System.out.println("Reversed number is: " + reverse);

        sc.close();


    }
}
