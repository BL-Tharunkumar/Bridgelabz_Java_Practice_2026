package day6.practice;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    // Static function to generate a random coupon number
    public static int getRandomCoupon(int n) {
        Random random = new Random();
        return random.nextInt(n);  // generates number between 0 to n-1
    }

    // Static function to count random numbers needed
    public static int collectCoupons(int n) {
        boolean[] collected = new boolean[n];
        int distinctCount = 0;
        int totalCount = 0;

        while (distinctCount < n) {
            int coupon = getRandomCoupon(n);
            totalCount++;

            if (!collected[coupon]) {
                collected[coupon] = true;
                distinctCount++;
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of distinct coupons: ");
        int n = sc.nextInt();

        int result = collectCoupons(n);

        System.out.println("Total random numbers generated: " + result);

        sc.close();
    }
}
