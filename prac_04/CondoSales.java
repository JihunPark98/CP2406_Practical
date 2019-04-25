import java.util.Scanner;
public class CondoSales
{
    public static void main(String[] args)
    {
        int selection, price;
        String result;
        final int PARK_PR = 150000, GOLF_PR = 170000, LAKE_PR = 210000;
        final String PARK_STR = "Park view", GOLF_STR = "Golf course view", LAKE_STR = "Lake view", INVALID_STR = "Invalid selection";
        Scanner kb = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. " + PARK_STR);
        System.out.println("2. " + GOLF_STR);
        System.out.println("3. " + LAKE_STR);
        System.out.println("Select between 1, 2, or 3 \n>>>");
        selection = kb.nextInt();
        if(selection == 1)
        {
            result = PARK_STR;
            price = PARK_PR;
        }
        else
            if(selection == 2)
            {
                result = GOLF_STR;
                price = GOLF_PR;
            }
            else
                if(selection == 3)
                {
                    result = LAKE_STR;
                    price = LAKE_PR;
                }
                else
                {
                    result = INVALID_STR;
                    price = 0;
                }
        System.out.println("You selected " + result + " $" + price);
    }
}