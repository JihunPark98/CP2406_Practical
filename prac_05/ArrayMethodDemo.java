public class ArrayMethodDemo
{
    public static void main(String[] args)
    {
        int[] numbers = {17, 21, 33, 47, 57};
        display(numbers);
        System.out.println("");
        displaySum(numbers);
    }
    public static void display(int[] numbers)
    {
        System.out.print("The numbers are: ");
        for(int i = 0; i < numbers.length; ++i)
            System.out.print(numbers[i] + " ");
    }
    public static void displaySum(int[] numbers)
    {
        int total = 0;
        for(int i = 0; i<numbers.length; i++)
            total = total + numbers[i];
        System.out.print("Sum is : " + total);
    }
}