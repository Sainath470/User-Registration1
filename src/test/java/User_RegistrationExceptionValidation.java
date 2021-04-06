import org.junit.jupiter.api.Test;
import userRegistration1.UserValidateException;

class User_RegistrationExceptionValidation {
    @Test
    public void givenEmptyFirstName_WhenEmpty_throwsException() {
        User_Registration ex_obj = new User_Registration();
        try {
            ex_obj.firstnameValidation("");
        } catch (UserValidateException obj) {
            obj.printStackTrace();
        }
    }
    @Test
    public void givenEmptyFirstName_WhenNull_throwsException()
    {
        User_Registration ex_obj = new User_Registration();
        try {
          boolean b= ex_obj.firstnameValidation(null);
        } catch (UserValidateException obj) {
            obj.printStackTrace();
        }

    }

    @Test
    public void givenEmptyLastName_WhenEmpty_throwsException() {
        User_Registration ex_obj = new User_Registration();
        try {
            ex_obj.lastnameValidation("");
        } catch (UserValidateException obj) {
            obj.printStackTrace();
        }
    }

    @Test
    public void givenEmptyLastName_WhenNull_throwsException() {
        User_Registration ex_obj = new User_Registration();
        try {
            ex_obj.lastnameValidation(null);
        } catch (UserValidateException obj) {
            obj.printStackTrace();
        }
    }

    @Test
    public void givenEmptyPhoneNumber_WhenEmpty_throwsException() {
        User_Registration ex_obj = new User_Registration();
        try {
            ex_obj.phonenumberValidation("");
        } catch (UserValidateException obj) {
            obj.printStackTrace();
        }

    }

    @Test
    public void givenEmptyPhoneNumber_WhenNull_throwsException()
    {
        User_Registration ex_obj=new User_Registration();
        try{
            ex_obj.phonenumberValidation(null);
        }catch(UserValidateException obj){
            obj.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenEmpty_throwsException()
    {
        User_Registration ex_obj=new User_Registration();
        try{
            ex_obj.emailValidation("");
        }catch(UserValidateException obj){
            obj.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenNull_throwsException()
    {
        User_Registration ex_obj=new User_Registration();
        try{
            ex_obj.emailValidation(null);
        }catch(UserValidateException obj){
            obj.printStackTrace();
        }
    }


}