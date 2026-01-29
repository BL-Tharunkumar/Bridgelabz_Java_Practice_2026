package day6.practice;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");

        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        int a=0 , b = 1;

        for (int i = 1; i <= n;i++){
            System.out.println( a + "");

            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}
