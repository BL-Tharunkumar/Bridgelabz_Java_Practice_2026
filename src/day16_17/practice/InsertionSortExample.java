package day16_17.practice;

public class InsertionSortExample {

    public static void insertionSort(int[] ids) {

        for (int i = 1; i < ids.length; i++) {

            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {

                ids[j + 1] = ids[j];
                j--;
            }

            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] employeeIds = {104, 101, 108, 102, 106};

        insertionSort(employeeIds);

        System.out.println("Sorted Employee IDs:");

        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }
}
