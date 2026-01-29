package day5.practice;

public class PrimeFactors {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a number");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if (N <= 1) {
            System.out.println("No prime factors for " + N);
            return;
        }

        System.out.println("Prime factors of " + N + " are:");

        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N = N / i;
            }
        }

        // If remaining N is a prime number greater than 1
        if (N > 1) {
            System.out.print(N);
        }
    }
}
