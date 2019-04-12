public class NumbersDemo
{
    public static void main(String[] args)
    {
        int num1 = 4, num2 = 33;
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);

    }
    public static void displayTwiceTheNumber(int n)
    {
        final int x = 2;
        System.out.println(n + " times " + x + " is " + (n * x));
    }
    public static void displayNumberPlusFive(int n)
    {
        final int x = 5;
        System.out.println(n + " plus " + x + " is " + (n + x));
    }
    public static void displayNumberSquared(int n)
    {
        System.out.println(n + " squared is " + (n * n));
    }
}