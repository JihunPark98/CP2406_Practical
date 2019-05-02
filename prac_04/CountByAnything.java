import java.util.Scanner;
public class CountByAnything
{
    public static void main(String[] args)
    {
        final int stop = 200;
        final int NUMBER_PER_LINE;
        int value;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number to count by >>>");
        value = kb.nextInt();
        NUMBER_PER_LINE = value * 10;
        for(int i = value; i <= stop; i += value)
        {
            System.out.print(i + " ");
            if( i % NUMBER_PER_LINE == 0)
                System.out.println();
        }
    }
}