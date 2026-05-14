package day16_17.practice;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReadingComparison {

    public static void main(String[] args) {

        String filePath = "largefile.txt";

        // ---------------- FileReader ----------------
        try {

            long startFileReader = System.currentTimeMillis();

            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader1 = new BufferedReader(fileReader);

            while (bufferedReader1.readLine() != null) {
                // Reading file line by line
            }

            bufferedReader1.close();

            long endFileReader = System.currentTimeMillis();

            System.out.println("FileReader Time: " +
                    (endFileReader - startFileReader) + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // ---------------- InputStreamReader ----------------
        try {

            long startInputStream = System.currentTimeMillis();

            FileInputStream fileInputStream =
                    new FileInputStream(filePath);

            InputStreamReader inputStreamReader =
                    new InputStreamReader(fileInputStream);

            BufferedReader bufferedReader2 =
                    new BufferedReader(inputStreamReader);

            while (bufferedReader2.readLine() != null) {
                // Reading file line by line
            }

            bufferedReader2.close();

            long endInputStream = System.currentTimeMillis();

            System.out.println("InputStreamReader Time: " +
                    (endInputStream - startInputStream) + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class FirstAndLastOccurrence {

        // Find First Occurrence
        public static int findFirstOccurrence(int[] arr, int target) {

            int left = 0;
            int right = arr.length - 1;
            int result = -1;

            while (left <= right) {

                int mid = (left + right) / 2;

                if (arr[mid] == target) {

                    result = mid;

                    // Search on left side
                    right = mid - 1;

                } else if (arr[mid] < target) {

                    left = mid + 1;

                } else {

                    right = mid - 1;
                }
            }

            return result;
        }

        // Find Last Occurrence
        public static int findLastOccurrence(int[] arr, int target) {

            int left = 0;
            int right = arr.length - 1;
            int result = -1;

            while (left <= right) {

                int mid = (left + right) / 2;

                if (arr[mid] == target) {

                    result = mid;

                    // Search on right side
                    left = mid + 1;

                } else if (arr[mid] < target) {

                    left = mid + 1;

                } else {

                    right = mid - 1;
                }
            }

            return result;
        }

        public static void main(String[] args) {

            int[] numbers = {1, 2, 2, 2, 3, 4, 5, 5, 5, 6};

            int target = 5;

            int first = findFirstOccurrence(numbers, target);

            int last = findLastOccurrence(numbers, target);

            // Output
            if (first != -1) {

                System.out.println("First Occurrence: " + first);

                System.out.println("Last Occurrence: " + last);

            } else {

                System.out.println("Element not found.");
            }
        }
    }
}
