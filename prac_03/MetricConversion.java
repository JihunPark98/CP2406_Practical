import java.util.Scanner;
public class MetricConversion
{
    public static void main(String[] args)
    {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        a = input.nextInt();
        convertToCm(a);
        convertToLiters(a);
    }
    public static void convertToCm(int inches)
    {
        double cm;
        final double CM_FACTOR = 2.54;
        cm = inches * CM_FACTOR;
        System.out.println(inches + "inches is" + cm + "centimeters");
    }
    public static void convertToLiters(int gallons)
    {
        double liters;
        final double LITER_FACTOR = 3.7854;
        liters = gallons * LITER_FACTOR;
        System.out.println(gallons + " gallons is " + liters + " liters");
    }
}