package userRegistration1;

public class UserValidateException extends Exception {

    public exception_e type;

   public UserValidateException( exception_e type, String message)
   {
       super(message);
       this.type=type;
   }

   public enum exception_e{

       NULL_INPUT,
       EMPTY_INPUT

   }
}
