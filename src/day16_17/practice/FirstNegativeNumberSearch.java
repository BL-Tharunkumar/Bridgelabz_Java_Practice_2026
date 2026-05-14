package day16_17.practice;

public class FirstNegativeNumberSearch {

    // Linear Search Method
    public static int findFirstNegative(int[] arr) {

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            // Check if the element is negative
            if (arr[i] < 0) {
                return i;
            }
        }

        // No negative number found
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 25, 7, -5, 30, -12};

        int result = findFirstNegative(numbers);

        // Output
        if (result != -1) {
            System.out.println("First negative number found at index: "
                    + result);
        } else {
            System.out.println("No negative number found.");
        }
    }
}
