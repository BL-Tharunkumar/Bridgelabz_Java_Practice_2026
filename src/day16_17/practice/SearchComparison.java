package day16_17.practice;

import java.util.Arrays;

public class SearchComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int size = 1000000;
        int[] data = new int[size];

        // Fill dataset
        for (int i = 0; i < size; i++) {
            data[i] = i + 1;
        }

        int target = 999999;

        // Linear Search Timing
        long startLinear = System.nanoTime();

        int linearResult = linearSearch(data, target);

        long endLinear = System.nanoTime();

        // Binary Search Timing
        Arrays.sort(data); // Required for Binary Search

        long startBinary = System.nanoTime();

        int binaryResult = binarySearch(data, target);

        long endBinary = System.nanoTime();

        // Time Calculation
        long linearTime = endLinear - startLinear;
        long binaryTime = endBinary - startBinary;

        // Output
        System.out.println("Linear Search Result Index: " + linearResult);
        System.out.println("Linear Search Time: " + linearTime + " ns");

        System.out.println();

        System.out.println("Binary Search Result Index: " + binaryResult);
        System.out.println("Binary Search Time: " + binaryTime + " ns");
    }
}
