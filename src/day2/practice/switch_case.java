package day2.practice;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Character to Vowel: ");

        char letter = sc.next().charAt(0);

        switch(letter) {
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                System.out.println("The character is a Vowel");
                break;
            default:
                System.out.println("Not a Vowel");
        }


        System.out.print("Enter the number of  Month: ");

        int number = sc.nextInt();


        switch (number) {
            case 1:
                System.out.println("Jannuary");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("The Entered number is invalid");


        }




        sc.close();


    }
}
