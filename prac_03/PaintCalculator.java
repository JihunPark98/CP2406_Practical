import java.util.Scanner;
public class PaintCalculator
{
    public static void main(String[] args)
    {
        double length, width, height;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the room's length >>>");
        length = kb.nextDouble();
        System.out.println("Enter the room's width >>>");
        width = kb.nextDouble();
        System.out.println("Enter the room's height >>>");
        height = kb.nextDouble();
        double price;
        price = computeArea(length, width, height);
        System.out.println("The price to paint the room is $" + price);
    }
    public static double computeArea(double length, double width, double height)
    {
        final double PRICE_GALLON = 32;
        double area;
        area = (length + width) * height * 2;
        double gallons, price;
        gallons = computeGallons(area);
        System.out.println("Need " + gallons + " gallons ");
        price = gallons * PRICE_GALLON;
        return price;
    }
    public static double computeGallons(double area)
    {
        final int SQ_PER_GAL = 350;
        double gallons;
        gallons = area / SQ_PER_GAL;
        return gallons;
    }
}