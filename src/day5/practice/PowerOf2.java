package day5.practice;

public class PowerOf2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide value of N");
            return;
        }

        int N = Integer.parseInt(args[0]);

        // Validate N range
        if (N < 0 || N >= 31) {
            System.out.println("Please enter N such that 0 <= N < 31");
            return;
        }

        int power = 1;

        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + power);
            power = power * 2;
        }
    }
}
