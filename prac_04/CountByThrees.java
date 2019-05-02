public class CountByThrees
{
    public static void main(String[] args)
    {
        final int start = 3;
        final int stop = 300;
        final int NUMBER_PER_LINE = 30;
        for(int i = start; i <= stop; i += start)
        {
            System.out.print(i + " ");
            if(i % NUMBER_PER_LINE == 0)
                System.out.println();
        }
    }
}