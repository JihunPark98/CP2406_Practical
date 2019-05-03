import java.util.Scanner;
public class ValidatePassword
{
    public static void main(String[] args)
    {
        String aString;
        int stringLength;
        int upperCount = 0, lowerCount = 0, digitCount = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a password >>>");
        aString = kb.nextLine();
        stringLength = aString.length();

        for(int i = 0; i < stringLength; i++)
        {
            char c = aString.charAt(i);
            if(Character.isUpperCase(c))
                upperCount++;
            else
                if(Character.isLowerCase(c))
                    lowerCount++;
                else
                    if(Character.isDigit(c))
                        digitCount++;
                    else
                        break;
        }

        if(upperCount >= 2 && lowerCount >= 2 && digitCount >= 2)
            System.out.println("Valid password");
        else
        {
            if(upperCount < 2)
                System.out.println("More than 2 uppercase letters required");
            if(lowerCount < 2)
                System.out.println("More than 2 lowercase letters required");
            if(digitCount < 2)
                System.out.println("More than 2 digital letters required");
        }
    }
}