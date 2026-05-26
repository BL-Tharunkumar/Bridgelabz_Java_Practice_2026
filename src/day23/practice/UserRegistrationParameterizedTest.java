package day23.practice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationParameterizedTest {

    private String email;
    private boolean expectedResult;

    UserRegistration user =
            new UserRegistration();

    public UserRegistrationParameterizedTest(
            String email,
            boolean expectedResult) {

        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {

        return Arrays.asList(new Object[][]{

                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},

                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc@abc@gmail.com", false}
        });
    }

    @Test
    public void givenEmail_ShouldReturnExpectedResult() {

        boolean result;

        try {

            result = user.validateEmail(email);

        } catch (UserRegistrationException e) {

            result = false;
        }

        Assert.assertEquals(expectedResult, result);
    }
}
