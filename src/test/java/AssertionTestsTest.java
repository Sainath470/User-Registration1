import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import userRegistration1.UserValidatorTestTest;

import java.util.regex.Pattern;



public class AssertionTestsTest {

    UserValidatorTestTest testobj = new UserValidatorTestTest();

    @Test
    public void givenFirstname_When_Correct_returnTrue() {
        boolean first_name = testobj.firstNameValidation("Venkata");
        Assert.assertTrue(first_name);

    }

    @Test
    public void givenFirstname_When_NotCorrect_returnFalse() {
        boolean first_name = testobj.firstNameValidation("venkata");
        Assert.assertFalse(first_name);
    }

    @Test
    public void givenLastname_When_Correct_returnTrue() {
        boolean last_name = testobj.lastNameValidation("Sainath");
        Assert.assertTrue(last_name);
    }

    @Test
    public void givenLastname_When_NotCorrect_returnFalse() {
        boolean last_name = testobj.lastNameValidation("sa inath");
        Assert.assertFalse(last_name);
    }

    @Test
    public void givenPhoneNumber_When_Correct_returnTrue() {
        boolean phone_number = testobj.mobileValidation("91 9991116669");
        Assert.assertTrue(phone_number);
    }

    @Test
    public void givenPhoneNumber_When_NotCorrect_returnFalse() {
        boolean phone_number = testobj.mobileValidation("919s991116669");
        Assert.assertFalse(phone_number);

    }


}
