package day5.practice;

public class HarmonicNumber {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide the value of N");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if (N == 0) {
            System.out.println("N should not be zero");
            return;
        }

        double harmonic = 0.0;

        for (int i = 1; i <= N; i++) {
            harmonic = harmonic + (1.0 / i);
        }

        System.out.println("Nth Harmonic Value = " + harmonic);
    }
}
