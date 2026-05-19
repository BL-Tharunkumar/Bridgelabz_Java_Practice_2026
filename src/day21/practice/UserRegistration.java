package day21.practice;

import java.util.regex.Pattern;

public class UserRegistration {

    // First Name Validation
    public boolean validateFirstName(String firstName)
            throws UserRegistrationException {

        String regex = "^[A-Z][a-z]{2,}$";

        if (Pattern.matches(regex, firstName)) {
            return true;
        } else {
            throw new UserRegistrationException(
                    "Invalid First Name");
        }
    }

    // Last Name Validation
    public boolean validateLastName(String lastName)
            throws UserRegistrationException {

        String regex = "^[A-Z][a-z]{2,}$";

        if (Pattern.matches(regex, lastName)) {
            return true;
        } else {
            throw new UserRegistrationException(
                    "Invalid Last Name");
        }
    }

    // Email Validation
    public boolean validateEmail(String email)
            throws UserRegistrationException {

        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$";

        if (Pattern.matches(regex, email)) {
            return true;
        } else {
            throw new UserRegistrationException(
                    "Invalid Email");
        }
    }

    // Mobile Validation
    public boolean validateMobile(String mobile)
            throws UserRegistrationException {

        String regex = "^[0-9]{2} [0-9]{10}$";

        if (Pattern.matches(regex, mobile)) {
            return true;
        } else {
            throw new UserRegistrationException(
                    "Invalid Mobile Number");
        }
    }

    // Password Validation
    public boolean validatePassword(String password)
            throws UserRegistrationException {

        String regex =
                "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$";

        if (Pattern.matches(regex, password)) {
            return true;
        } else {
            throw new UserRegistrationException(
                    "Invalid Password");
        }
    }
}
