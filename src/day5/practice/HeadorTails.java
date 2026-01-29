package day5.practice;

import java.util.Random;
import java.util.Scanner;

public class HeadorTails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Enter the coin to Flip: ");

        int flips  = sc.nextInt();

        // Validate positive integer
        if (flips <= 0){
            System.out.println("Please enter a positive integer.");
            return;
        }

        int heads = 0;
        int tails = 0;

        // flip a coin
        for(int i = 1; i <= flips;i++){
            double value = random.nextDouble(); // 0.0 to 1.0

            if (value < 0.5){
                tails++;

            }
            else {
                heads++;
            }

        }

        // calculate percentages

        double  headpercentage = (heads * 100) / flips;
        double trailpercentage = (tails * 100) / flips;

        // Output
        System.out.println("Number of Heads: " + heads);
        System.out.println("Number of Tails: " + tails);
        System.out.println("Head Percentage: " + headpercentage + "%");
        System.out.println("Tail Percentage: " + trailpercentage + "%");






    }
}
