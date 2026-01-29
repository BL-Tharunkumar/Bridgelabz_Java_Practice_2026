package day5.practice;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number to Check Odd or Even:  ");
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("The Number is Even");
        }
        else {
            System.out.println("The Number is Odd");
        }
    }
}
