package userRegistration1;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface Regex {
   Boolean StringUserValidate(String s);
}
public class StringUserValidate {
    static final String NAME_PATTERN = ("[A-Z][a-z]{2,}");
    static final String EMAIL_PATTERN = ("^[A-Za-z]+([.+-]?[a-z A-z0-9]+)?@[a-zA-z0-9]{1,6}\\.[a-zA-Z]{2,6},?([.][a-zA-z+,]{2,6})?$");
    static final String MOBILE_NUMBER_PATTERN = ("^[0]?([+][0-9]{2,3}[-])?[6-9]+[0-9]{9}");
    static final String PASSWORD_PATTERN = ("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()]).{8,}$");
    static Scanner userinput=new Scanner(System.in);
    static String firstNameValidation()
    {
        System.out.println("""
                Enter the FirstName
                First Name Should Contains Minimum of 3 Characters
                First Letter Should be in Capital""");
        return userinput.next();
    }

    static String lastNameValidation()
    {
        System.out.println("""
                Enter the LastName
                Last Name Should Contains Minimum of 3 Characters
                First Letter Should be in Capital""");
        return userinput.next();
    }

    static String emailValidation()
    {
        System.out.println("Enter The Email Address");
        return userinput.next();
    }

    static String mobileValidation()
    {
        System.out.println("Enter the Mobile Number");
        return userinput.next();
    }

    static String passwordValidation()
    {
        System.out.println("Enter the pasword");
        return userinput.next();
    }

    public static String printResult(Boolean message)
    {
        if(Boolean.TRUE.equals(message))
        {
            return  "VALID";
        }
        else
            return "INVALID";
    }

    public static void main(String[] args)
    {
        Regex validateFirstName = firstName -> Pattern.matches(NAME_PATTERN,firstName);
        Regex validateLastName = lastName -> Pattern.matches(NAME_PATTERN,lastName);
        Regex validateEmail = email -> Pattern.matches(EMAIL_PATTERN, email);
        Regex validateMobileNumber = mobileNumber -> Pattern.matches(MOBILE_NUMBER_PATTERN, mobileNumber);
        Regex validatePassword = password -> Pattern.matches(PASSWORD_PATTERN, password);
        System.out.println(printResult(validateFirstName.StringUserValidate(firstNameValidation())));
        System.out.println(printResult(validateLastName.StringUserValidate(lastNameValidation())));
        System.out.println(printResult(validateEmail.StringUserValidate(emailValidation())));
        System.out.println(printResult(validateMobileNumber.StringUserValidate(mobileValidation())));
        System.out.println(printResult(validatePassword.StringUserValidate(passwordValidation())));
    }
}