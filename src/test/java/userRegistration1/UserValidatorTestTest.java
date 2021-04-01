package userRegistration1;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestTest {

    @Test
    public boolean firstNameValidation(String firstname) {
        boolean fname = Pattern.matches("^[A-Z][a-z]{2,}", firstname);
        return fname;
    }

    @Test
    public boolean lastNameValidation(String lastname) {
        boolean lname= Pattern.matches("^[A-Z][a-z]{2,}", lastname);
        return  lname;
    }

    @Test
    public boolean mobileValidation(String mobile) {
        boolean mob=Pattern.matches("\\d{1,2}[\\s+]?\\d{1,10}", mobile);
        return mob;
    }

    @Test
    public boolean passwordValidation(String password) {
        boolean pass=Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()]).{8,}$", password);
        return pass;
    }
}