
import userRegistration1.UserValidateException;

import java.util.regex.Pattern;

public class User_Registration {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String passWord;
    public static void printingResult(boolean check) {
        if (Boolean.TRUE.equals(check)) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
    }

    public Boolean firstnameValidation(String firstname) throws UserValidateException {
        try {
            //Letting below statement trigger an empty value exception
            if (firstname.length() == 0)
                throw new UserValidateException(UserValidateException.exception_e.EMPTY_INPUT, "YOUR NAME, PROVIDED EMPTY");
            else {
                return Pattern.matches("^[A-Z][a-z]{2,}", firstname);
            }
        } catch (NullPointerException e) {
            throw new UserValidateException(UserValidateException.exception_e.EMPTY_INPUT, "YOUR FIRST NAME, PROVIDED NULL");
        }

    }

    public Boolean lastnameValidation(String last_name) throws UserValidateException {
        try {
            //Letting below statement trigger an empty value exception
            if (last_name.length() == 0)
                throw new UserValidateException(UserValidateException.exception_e.EMPTY_INPUT, "YOUR LAST NAME, PASSED IS EMPTY");
            else {
                return Pattern.matches("^[A-Z][a-z]{2,}", last_name);
            }
        } catch (NullPointerException e) {
            throw new UserValidateException(UserValidateException.exception_e.EMPTY_INPUT, "YOUR LAST NAME, PASSED IS A NULL");
        }
    }

    public Boolean phonenumberValidation(String phoneNumber) throws UserValidateException {
        try {
            //Letting below statement trigger an empty value exception
            if (phoneNumber.length() == 0)
                throw new UserValidateException(UserValidateException.exception_e.NULL_INPUT, "YOUR MOBILE NUMBER, PASSED IS EMPTY");
            else {
                return Pattern.matches("(?:^[+][0-9]{1} [0-9]{10}|^[0-9]{10}|^[0-9]{1} [0-9]{10}|[0-9]{2} [0-9]{10}|[+][0-9]{2} [0-9]{10})", phoneNumber);
            }
        } catch (NullPointerException e) {
            throw new UserValidateException(UserValidateException.exception_e.EMPTY_INPUT, "YOUR MOBILE NUMBER: PASSED NULL");
        }

    }

    public Boolean emailValidation(String email) throws UserValidateException {
        try {
            //Letting below statement trigger an empty value exception
            if (email.length() == 0)
                throw new UserValidateException(UserValidateException.exception_e.EMPTY_INPUT, "YOUR EMAIL, PASSED IS EMPTY");
            else {
                return Pattern.matches("^(?!\\.)[A-Za-z0-9]+([._%+-]?[0-9])*@[A-Za-z0-9-]+\\.[a-zA-Z]{2,6}(\\.[A-Za-z]{2,6})?$", email);

            }
        } catch (NullPointerException e) {
            throw new UserValidateException(UserValidateException.exception_e.EMPTY_INPUT, "YOUR EMAIL, PASSED IS NULL");
        }

    }


    public Boolean passwordValidation(String password) throws UserValidateException {
        try {
            //Letting below statement trigger an empty value exception
            if (password.length() == 0)
                throw new UserValidateException(UserValidateException.exception_e.EMPTY_INPUT, "YOUR PASSWORD, PASSED IS EMPTY");
            else {
                return Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()]).{8,}$", password);
            }
        } catch (NullPointerException e) {
            throw new UserValidateException(UserValidateException.exception_e.EMPTY_INPUT, "YOUR PASSWORD, PASSED IS A NULL");
        }

    }

    public boolean emailValidation1(String email) {
        return Pattern.matches("^[a-zA-Z]+([.\\-+]?\\d+)?[@][a-z\\d]+\\.[a-z]{2,3}([,])?(\\.[a-z]{2,3})?", email);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration");
        User_Registration userinfo = new User_Registration();

    }

}