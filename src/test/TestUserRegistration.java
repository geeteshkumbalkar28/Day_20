package test;

import UserRegistration.ValidationDuringUserEntry;
import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration
{
    ////firstName
    @Test
     public void firstDayValidationTest1()
     {
         ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
         Assert.assertTrue(validationDuringUserEntry.firstNameValidation("Gee"));
     }
    @Test
    public void firstDayValidationTest2()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.firstNameValidation("Kum"));
    }
    @Test
    public void firstDayValidationTest3()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.firstNameValidation("Gesse"));
    }
    @Test
    public void firstDayValidationTest4()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.firstNameValidation("gee"));
    }
    @Test
    public void firstDayValidationTest5()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.firstNameValidation("sadee"));
    }@Test

    public void firstDayValidationTest6()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.firstNameValidation("GSSS"));
    }
    @Test
    public void firstDayValidationTest7()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.firstNameValidation("GssaaA"));
    }

////lastNameValidation
    @Test
    public void lastNameValidationtest1()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.lastNameValidation("Geesa"));
    }

    @Test
    public void lastNameValidationtest2()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.lastNameValidation("afdasad"));
    }
    @Test
    public void lastNameValidationtest3()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.lastNameValidation("DDDDD"));
    }
    @Test
    public void lastNameValidationtest4()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.lastNameValidation("SSSSD"));
    }
    @Test
    public void lastNameValidationtest5()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.lastNameValidation("asdasf"));
    }
    @Test
    public void lastNameValidationtest6()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.lastNameValidation("Kum"));
    }
    @Test
    public void lastNameValidationtest7() {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.lastNameValidation("Tha"));
    }
    //emailValidation
    @Test
    public void emailValidationTest1()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.emailValidation("abc@yahoo.com"));
    }

    @Test
    public void emailValidationTest2()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.emailValidation("abc-100@yahoo.com"));
    }
    @Test
    public void emailValidationTest3()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.emailValidation("abc.100@yahoo.com"));
    }
    @Test
    public void emailValidationTest4()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.emailValidation("abc111@abc.com"));
    }
    @Test
    public void emailValidationTest5()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.emailValidation("abc-100@abc.net"));
    }
    @Test
    public void emailValidationTest6()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.emailValidation("abc.100@abc.com.au"));
    }

    @Test
    public void emailValidationTest7()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.emailValidation("abc@1.com"));
    }
    @Test
    public void emailValidationTest8()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.emailValidation("abc@gmail.com.com"));
    }

    @Test
    public void emailValidationTest9()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.emailValidation("abc+100@gmail.com"));
    }

 //   emailValidation
    @Test
    public void emailValidationTest10()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.emailValidation("abc"));
    }

    @Test
    public void emailValidationTest11()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.emailValidation("abc@.com.my"));
    }
    @Test
    public void emailValidationTest12()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.emailValidation("abc123@gmail.a"));
    }



    ////phoneValidation
    @Test
    public void phoneValidationTest1()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.phoneValidation("7447376717"));
    }
    @Test
    public void phoneValidationTest2()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.phoneValidation("7447376717"));
    }
    @Test
    public void phoneValidationTest3()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.phoneValidation("91 7447376717"));
    }
    @Test
    public void phoneValidationTest4()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.phoneValidation("91 747376717"));
    }
    @Test
    public void phoneValidationTest5()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.phoneValidation("91747376717"));
    }





    ///Password

    @Test
    public void passwordValidationTest1()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.passwordValidation("Lokhi@11"));
    }
    @Test
    public void passwordValidationTest2()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.passwordValidation("Lokhi11@11"));
    }

    @Test
    public void passwordValidationTest3()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertFalse(validationDuringUserEntry.passwordValidation("Lokhi11@11"));
    }
    @Test
    public void passwordValidationTest4()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.passwordValidation("Lokhiass1@"));
    }


    @Test
    public void passwordValidationTest6()
    {
        ValidationDuringUserEntry validationDuringUserEntry = new ValidationDuringUserEntry();
        Assert.assertTrue(validationDuringUserEntry.passwordValidation("Lsokhinh1@"));
    }
}
