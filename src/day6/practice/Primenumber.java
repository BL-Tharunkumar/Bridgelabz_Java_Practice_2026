package day6.practice;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check it is prime number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // 0 and 1 are not prime
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("It is a Prime Number");
        } else {
            System.out.println("It is Not a Prime Number");
        }

        sc.close();
    }
}
