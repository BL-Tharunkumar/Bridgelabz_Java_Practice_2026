package day23.practice;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration user =
            new UserRegistration();

    // Happy Test Case
    @Test
    public void givenValidFirstName_ShouldReturnTrue()
            throws UserRegistrationException {

        boolean result =
                user.validateFirstName("Tharun");

        Assert.assertTrue(result);
    }

    // Sad Test Case
    @Test(expected = UserRegistrationException.class)
    public void givenInvalidFirstName_ShouldThrowException()
            throws UserRegistrationException {

        user.validateFirstName("th");
    }

    // Email Test
    @Test
    public void givenValidEmail_ShouldReturnTrue()
            throws UserRegistrationException {

        boolean result =
                user.validateEmail("abc@yahoo.com");

        Assert.assertTrue(result);
    }

    // Invalid Email Test
    @Test(expected = UserRegistrationException.class)
    public void givenInvalidEmail_ShouldThrowException()
            throws UserRegistrationException {

        user.validateEmail("abc@.com");
    }
}
