package day2.practice;

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
        System.out.print("Enter the Input Number: ");

        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= num;i++){
            sum = sum + i;

        }
        System.out.println("Sum of first " + num + " natural numbers = " + sum);

//        2. Write a Program to reverse the integer number eg. Input n=231 reverse is 131
        System.out.print("Enter the numbers to Reverse: ");
        int number = sc.nextInt();
        int reverse = 0;
        int temp = number;

        for (; number != 0; number = number / 10){
            int digit = number % 10;
            reverse = reverse * 10 + digit;

        }

        System.out.println("Reversed number is: " + reverse);

//        3. Write a Program to find Palindrome Number

        if(reverse == temp){
            System.out.println("The number is Palindrome");

        }
        else {
            System.out.println("The number is not a  Palindrome");
        }

        sc.close();


    }
}
