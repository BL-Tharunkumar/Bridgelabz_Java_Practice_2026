package day5.practice;

import java.util.Scanner;

public class ThreeSumZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (N): ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        System.out.println("Distinct triplets that sum to zero:");

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;
                    }
                }
            }
        }

        System.out.println("Number of distinct triplets = " + count);
        sc.close();
    }
}
