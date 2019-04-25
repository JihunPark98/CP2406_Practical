import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number >>>");
        number = input.nextInt();
        if(isEven(number))
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
    }
    public static boolean isEven(int number)
    {
        boolean result;
        if(number % 2 == 1)
            result = false;
        else
            result = true;
        return result;
    }
}