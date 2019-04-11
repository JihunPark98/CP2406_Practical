import java.util.Scanner;
public class ChiliToGo
{
    public static void main(String[] args)
    {
        final double ADULT_PRICE = 7;
        final double CHILD_PRICE = 4;
        int adultMeals;
        int childMeals;
        double totalAdult, totalChild, grandTotal;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of adult meals ordered >>>");
        adultMeals = input.nextInt();
        System.out.println("Enter number of child meals ordered >>>");
        childMeals = input.nextInt();
        totalAdult = adultMeals * ADULT_PRICE;
        totalChild = childMeals * CHILD_PRICE;
        grandTotal = totalAdult + totalChild;
        System.out.println("Total of adults: " + totalAdult + " Total of child: " + totalChild + " Total: " + grandTotal);
    }
}