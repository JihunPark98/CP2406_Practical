import java.util.Scanner;
public class BabyNameComparison
{
    public static void main(String[] args)
    {
        String name1, name2, name3;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a name >>>");
        name1 = kb.nextLine();
        System.out.println("Enter a second name >>>");
        name2 = kb.nextLine();
        System.out.println("Enter a third name >>>");
        name3 = kb.next();
        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);
        System.out.println(name2 + " " + name1);
        System.out.println(name2 + " " + name3);
        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);
    }
}