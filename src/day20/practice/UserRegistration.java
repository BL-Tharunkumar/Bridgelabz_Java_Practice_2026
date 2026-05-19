package day20.practice;

import java.util.regex.Pattern;

public class UserRegistration {

    // First Name Validation
    public boolean validateFirstName(String firstName) {

        String regex = "^[A-Z][a-z]{2,}$";

        return Pattern.matches(regex, firstName);
    }

    // Last Name Validation
    public boolean validateLastName(String lastName) {

        String regex = "^[A-Z][a-z]{2,}$";

        return Pattern.matches(regex, lastName);
    }

    // Email Validation
    public boolean validateEmail(String email) {

        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$";

        return Pattern.matches(regex, email);
    }

    // Mobile Number Validation
    public boolean validateMobile(String mobile) {

        String regex = "^[0-9]{2} [0-9]{10}$";

        return Pattern.matches(regex, mobile);
    }

    // Password Validation
    public boolean validatePassword(String password) {

        String regex =
                "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$";

        return Pattern.matches(regex, password);
    }
}
