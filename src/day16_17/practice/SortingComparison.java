package day16_17.practice;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int size = 10000;

        int[] original = new int[size];

        Random random = new Random();

        // Generate random numbers
        for (int i = 0; i < size; i++) {
            original[i] = random.nextInt(100000);
        }

        // Copy arrays
        int[] bubbleArray = Arrays.copyOf(original, size);
        int[] mergeArray = Arrays.copyOf(original, size);
        int[] quickArray = Arrays.copyOf(original, size);

        // Bubble Sort Timing
        long startBubble = System.currentTimeMillis();

        bubbleSort(bubbleArray);

        long endBubble = System.currentTimeMillis();

        // Merge Sort Timing
        long startMerge = System.currentTimeMillis();

        mergeSort(mergeArray, 0, mergeArray.length - 1);

        long endMerge = System.currentTimeMillis();

        // Quick Sort Timing
        long startQuick = System.currentTimeMillis();

        quickSort(quickArray, 0, quickArray.length - 1);

        long endQuick = System.currentTimeMillis();

        // Output Results
        System.out.println("Bubble Sort Time: " +
                (endBubble - startBubble) + " ms");

        System.out.println("Merge Sort Time: " +
                (endMerge - startMerge) + " ms");

        System.out.println("Quick Sort Time: " +
                (endQuick - startQuick) + " ms");
    }
}
