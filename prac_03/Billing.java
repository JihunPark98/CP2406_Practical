public class Billing
{
    final static double TAX = 0.08;
    public static void main(String[] args)
    {
        double bill;
        bill = computeBill(24.99);
        System.out.println("The total cost for $24.99 is $" + bill);
        bill = computeBill(17.5, 4);
        System.out.println("The total four that costs $17.5 is $" + bill);
    }
    public static double computeBill(double amt)
    {
        double bill;
        bill = amt + amt * TAX;
        return bill;
    }
    public static double computeBill(double amt, int quantity)
    {
        double bill;
        bill = amt * quantity;
        bill = bill + bill * TAX;
        return bill;
    }
}