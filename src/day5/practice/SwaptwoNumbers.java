package day5.practice;

import java.util.Scanner;

public class SwaptwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();

        System.out.print("Enter B: ");
        int b = sc.nextInt();

        int temp = a;


        a = b;
        b = temp;


        System.out.println("A: "+ a);
        System.out.println("B: "+ b);

        sc.close();

    }
}
