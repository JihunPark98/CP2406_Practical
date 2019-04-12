import java.util.Scanner;
public class BookstoreCredit
{
    public static void main(String[] args)
    {
        String name;
        double gpa;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name >>>");
        name = input.nextLine();
        System.out.println("Enter your GPA >>>");
        gpa = input.nextDouble();
        computeDiscount(name, gpa);
    }
    public static void computeDiscount(String name, double gpa)
    {
        double discount;
        final double x = 10;
        discount = gpa * x;
        System.out.println(name + ", your GPA is " + gpa + ", your discount is $" + discount);
    }
}