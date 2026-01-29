package day5.practice;

import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows M: ");
        int m = sc.nextInt();

        System.out.print("Enter the number of columns N: ");
        int n = sc.nextInt();

        int[][] array = new int[m][n];

        System.out.println("Enter " + (m * n) + " elements:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // STEP 6: Print the 2D array
        System.out.println("2D Array Output:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(array[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }



    }

}
