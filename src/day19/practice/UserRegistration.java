package day19.practice;

import java.util.regex.Pattern;

public class UserRegistration {

    // UC1 - First Name Validations
    public static boolean validateFirstName(String firstName) {

        String regex = "^[A-Z][a-z]{2,}$";

        return Pattern.matches(regex, firstName);
    }

    // UC2 - Last Name Validation
    public static boolean validateLastName(String lastName) {

        String regex = "^[A-Z][a-z]{2,}$";

        return Pattern.matches(regex, lastName);
    }

    // UC3 - Email Validation
    public static boolean validateEmail(String email) {

        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$";

        return Pattern.matches(regex, email);
    }

    // UC4 - Mobile Number Validation
    public static boolean validateMobile(String mobile) {

        String regex = "^[0-9]{2} [0-9]{10}$";

        return Pattern.matches(regex, mobile);
    }

    // UC5 to UC8 - Password Validation
    public static boolean validatePassword(String password) {

        String regex =
                "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$";

        return Pattern.matches(regex, password);
    }

    public static void main(String[] args) {

        // First Name
        System.out.println("First Name Valid: " +
                validateFirstName("Tharun"));

        // Last Name
        System.out.println("Last Name Valid: " +
                validateLastName("Kumar"));

        // Email
        System.out.println("Email Valid: " +
                validateEmail("abc.xyz@bl.co.in"));

        // Mobile Number
        System.out.println("Mobile Valid: " +
                validateMobile("91 9919819801"));

        // Password
        System.out.println("Password Valid: " +
                validatePassword("Tharun@123"));
    }
}
