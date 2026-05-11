package day13.practice;

import java.util.Arrays;

class MaximumTest<T extends Comparable<T>> {

    T x, y, z;

    // Parameterized Constructor
    public MaximumTest(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Generic Method for 3 Values
    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {

        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        printMax(max);
        return max;
    }

    // Generic Method for Multiple Values
    @SafeVarargs
    public static <T extends Comparable<T>> T testMaximum(T... values) {

        Arrays.sort(values);

        T max = values[values.length - 1];

        printMax(max);
        return max;
    }

    // Print Maximum Value
    public static <T> void printMax(T max) {
        System.out.println("Maximum Value is: " + max);
    }

    // Instance Method
    public T testMaximum() {
        return MaximumTest.testMaximum(x, y, z);
    }

    public static void main(String[] args) {

        // UC1 - Integer Test Cases
        System.out.println("Integer Test Cases");

        // TC 1.1 Max at 1st Position
        testMaximum(30, 20, 10);

        // TC 1.2 Max at 2nd Position
        testMaximum(10, 40, 20);

        // TC 1.3 Max at 3rd Position
        testMaximum(10, 20, 50);

        // UC2 - Float Test Cases
        System.out.println("\nFloat Test Cases");

        testMaximum(30.5f, 20.4f, 10.2f);
        testMaximum(10.1f, 50.5f, 20.3f);
        testMaximum(10.2f, 20.5f, 60.8f);

        // UC3 - String Test Cases
        System.out.println("\nString Test Cases");

        testMaximum("Peach", "Apple", "Banana");
        testMaximum("Apple", "Peach", "Banana");
        testMaximum("Apple", "Banana", "Peach");

        // Refactor 2 - Generic Class Object
        System.out.println("\nUsing Generic Class");

        MaximumTest<Integer> intObj =
                new MaximumTest<>(100, 200, 150);

        intObj.testMaximum();

        MaximumTest<String> strObj =
                new MaximumTest<>("Cat", "Dog", "Elephant");

        strObj.testMaximum();

        // UC4 - More than 3 Parameters
        System.out.println("\nMore Than Three Parameters");

        testMaximum(10, 20, 30, 40, 90, 60);

        testMaximum("Apple", "Orange", "Peach", "Banana");
    }
}
