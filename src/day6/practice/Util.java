package day6.practice;

public class Util {
    public static int dayOfWeek(int m, int d, int y) {

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }

    public static void main(String[] args) {

        int month = 12;
        int day = 18;
        int year = 2026;

        int result = dayOfWeek(month, day, year);
        System.out.println("Day of Week: " + result);
    }
}
