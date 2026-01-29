package day6.practice;


import java.util.Scanner;

public class Stopwatch {

    // Static variables
    static long startTime;
    static long endTime;

    // Start stopwatch
    public static void start() {
        startTime = System.currentTimeMillis();
    }

    // Stop stopwatch
    public static void stop() {
        endTime = System.currentTimeMillis();
    }

    // Calculate elapsed time
    public static long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Press ENTER to start the Stopwatch");
        sc.nextLine();
        start();

        System.out.print("Stopwatch started... Press ENTER to stop");
        sc.nextLine();
        stop();

        long elapsedTime = getElapsedTime();

        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");

        sc.close();
    }
}