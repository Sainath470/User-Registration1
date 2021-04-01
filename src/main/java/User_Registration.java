import java.util.regex.*;
import java.util.Scanner;
public class User_Registration{
    String firstName;
    Scanner input=new Scanner(System.in);

    //Method for taking first name as input
    public String getFirstName()
    {
        System.out.println("Please Enter your first Name");
        System.out.println("Rules: ");
        System.out.println("First letter should be Capital letter and minimum 3 characters");
        return input.next();
    }

    //Method for input checking
    public void userValidator()
    {
        this.firstName=getFirstName();
        boolean fName=Pattern.matches("^[A-Z][a-z]{2,}", firstName);
        System.out.print("Your Entered name is ");
        printingResult(fName);
    }

    public static void printingResult(boolean check)
    {
        if(Boolean.TRUE.equals(check))
        {
            System.out.println("VALID");
        }
        else
        {
            System.out.println("INVALID");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration");
        User_Registration userinfo=new User_Registration();
        userinfo.userValidator();
    }
}




