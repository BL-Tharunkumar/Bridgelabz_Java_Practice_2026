package day16_17.practice;

public class CountingSortExample {

    public static void countingSort(int[] ages) {

        int max = 18;
        int min = 10;

        int[] count = new int[max + 1];

        // Count frequency
        for (int age : ages) {
            count[age]++;
        }

        int index = 0;

        // Build sorted array
        for (int i = min; i <= max; i++) {

            while (count[i] > 0) {

                ages[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] ages = {15, 12, 18, 10, 14, 16, 12};

        countingSort(ages);

        System.out.println("Sorted Student Ages:");

        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
