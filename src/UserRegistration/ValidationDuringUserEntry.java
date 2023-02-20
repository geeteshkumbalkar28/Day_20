package UserRegistration;

import java.sql.Struct;
import java.util.regex.Pattern;

public class ValidationDuringUserEntry {
    public boolean firstNameValidation(String firstName)
    {
        if(Pattern.matches("^[A-Z]{1}[a-z]{2}$" , firstName) == true)
        {
            System.out.println("Valid First Name");
            return true;
        }
        else
        {
            System.out.println("Invalid First Name");
          return false;
        }

    }
    public boolean lastNameValidation(String lastName)
    {
        if(Pattern.matches("^[A-Z]{1}[a-z]{2}$" , lastName) == true)
        {
            System.out.println("Valid Last Name");
            return true;
        }
        else
        {
            System.out.println("Invalid Last Name");
        return false;
        }
    }
    //abc.xyz@bl.co.in   ///abc@bl.co
    public boolean emailValidation(String email)
    {
        if(Pattern.matches("^[a-z]+([+-.])?(.[a-z]+)?(.[0-9]+)?@([0-9]+.)?([a-z]+.)?([a-z]+.)?([a-z]+.)?$" , email) == true)
        {
            System.out.println("Valid email");
        return true;
        }
        else
        {
            System.out.println("Invalid email");
        return false;
        }
    }
    public boolean phoneValidation(String phone)
    {
        if(Pattern.matches("^(91\\s)?[0-9]{10}" ,phone) == true)
        {
            System.out.println("Valid phone number");
            return true;
        }
        else
        {
            System.out.println("Invalid phone number");
            return false;
        }
    }

    public boolean passwordValidation(String password)
    {
        if(Pattern.matches("^[A-Z][a-zA-Z]{7,}[0-9]{1,}[!@#$%^&*]{1}" ,password) == true)
        {
            System.out.println("Valid Password number");
            return true;
        }
        else
        {
            System.out.println("Invalid Password number");
            return false;
        }
    }

}
