package day23.practice;

public class UserRegistration {

    // First Name Validation
    IUserValidation firstNameValidator =
            firstName -> firstName.matches("^[A-Z][a-z]{2,}$");

    // Last Name Validation
    IUserValidation lastNameValidator =
            lastName -> lastName.matches("^[A-Z][a-z]{2,}$");

    // Email Validation
    IUserValidation emailValidator =
            email -> email.matches(
                    "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$");

    // Mobile Validation
    IUserValidation mobileValidator =
            mobile -> mobile.matches("^[0-9]{2} [0-9]{10}$");

    // Password Validation
    IUserValidation passwordValidator =
            password -> password.matches(
                    "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$");

    // Validate First Name
    public boolean validateFirstName(String firstName)
            throws UserRegistrationException {

        if (firstNameValidator.validate(firstName)) {
            return true;
        }

        throw new UserRegistrationException(
                "Invalid First Name");
    }

    // Validate Last Name
    public boolean validateLastName(String lastName)
            throws UserRegistrationException {

        if (lastNameValidator.validate(lastName)) {
            return true;
        }

        throw new UserRegistrationException(
                "Invalid Last Name");
    }

    // Validate Email
    public boolean validateEmail(String email)
            throws UserRegistrationException {

        if (emailValidator.validate(email)) {
            return true;
        }

        throw new UserRegistrationException(
                "Invalid Email");
    }

    // Validate Mobile
    public boolean validateMobile(String mobile)
            throws UserRegistrationException {

        if (mobileValidator.validate(mobile)) {
            return true;
        }

        throw new UserRegistrationException(
                "Invalid Mobile Number");
    }

    // Validate Password
    public boolean validatePassword(String password)
            throws UserRegistrationException {

        if (passwordValidator.validate(password)) {
            return true;
        }

        throw new UserRegistrationException(
                "Invalid Password");
    }
}
