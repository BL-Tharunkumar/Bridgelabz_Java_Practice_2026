package day16_17.practice;

public class FibonacciComparison {

    // Recursive Fibonacci
    public static int fibonacciRecursive(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n - 1)
                + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci
    public static int fibonacciIterative(int n) {

        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {

            sum = a + b;
            a = b;
            b = sum;
        }

        return b;
    }

    public static void main(String[] args) {

        int n = 30;

        // ---------------- Recursive ----------------
        long startRecursive = System.currentTimeMillis();

        int recursiveResult = fibonacciRecursive(n);

        long endRecursive = System.currentTimeMillis();

        // ---------------- Iterative ----------------
        long startIterative = System.currentTimeMillis();

        int iterativeResult = fibonacciIterative(n);

        long endIterative = System.currentTimeMillis();

        // ---------------- Output ----------------
        System.out.println("Recursive Fibonacci Result: "
                + recursiveResult);

        System.out.println("Recursive Time: "
                + (endRecursive - startRecursive) + " ms");

        System.out.println();

        System.out.println("Iterative Fibonacci Result: "
                + iterativeResult);

        System.out.println("Iterative Time: "
                + (endIterative - startIterative) + " ms");
    }
}
