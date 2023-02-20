package UserRegistration;
import java.util.regex.Pattern;
import java.util.Scanner;


public class UserRegistration
{
    private static Scanner scan = new Scanner(System.in);

    public static void main(String arg[])
    {
        ValidationDuringUserEntry validationUserEntry = new ValidationDuringUserEntry();
        System.out.println("Enetr your gamil");
        String gamil = scan.next();
		/*byte arr[]=poneNumber.getBytes();
		for(int i=0; i<arr.length;i++)
		{
			System.out.println( arr[i]);
		}*/
        validationUserEntry.emailValidation(gamil);

    }
}
