import java.util.Scanner;
public class InputCharacterInfo
{
    public static void main(String[] args)
    {
        char aChar;
        String aString;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a character >>>");
        aString = kb.nextLine();
        aChar = aString.charAt(0);
        System.out.println("The character is " + aChar);

        if(Character.isUpperCase(aChar))
            System.out.println(aChar + " is uppercase");
        else
            System.out.println(aChar + " is not uppercase");
        if(Character.isLowerCase(aChar))
            System.out.println(aChar + " is lowercase");
        else
            System.out.println(aChar + " is not lowercase");
        if(Character.isLetterOrDigit(aChar))
            System.out.println(aChar + " is a letter or digit");
        else
            System.out.println(aChar + " is not a letter or digit");
        if(Character.isWhitespace(aChar))
            System.out.println(aChar + " is white space");
        else
            System.out.println(aChar + " is not a white space");
    }
}