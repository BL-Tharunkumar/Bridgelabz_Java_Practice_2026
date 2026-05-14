package day16_17.practice;

public class BubbleSortExample {

    public static void bubbleSort(int[] marks) {

        int n = marks.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (marks[j] > marks[j + 1]) {

                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] marks = {85, 60, 95, 70, 50};

        bubbleSort(marks);

        System.out.println("Sorted Student Marks:");

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
