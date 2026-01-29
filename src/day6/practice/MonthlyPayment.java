package day6.practice;

public class MonthlyPayment {
    public static double monthlyPayment(double P, int Y, double R) {

        int n = 12 * Y;
        double r = R / (12 * 100);

        double payment = (P * r) / (1 - Math.pow(1 + r, -n));
        return payment;
    }

    public static void main(String[] args) {

        // Command line arguments
        double P = Double.parseDouble(args[0]); // Principal
        int Y = Integer.parseInt(args[1]);      // Years
        double R = Double.parseDouble(args[2]); // Rate of Interest

        double result = monthlyPayment(P, Y, R);

        System.out.println("Monthly Payment: " + result);
    }
}
