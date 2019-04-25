import javax.swing.JOptionPane;
public class CellPhoneService
{
    public static void main(String[] args)
    {
        int talk, text, data;
        final int TALK_MIN = 500;
        final int TEXT_MIN = 100;
        final int DATA_MIN = 2;
        final int PRICE_A = 49, PRICE_B = 55, PRICE_C = 61, PRICE_D = 70, PRICE_E = 79, PRICE_F = 87;
        String entry;
        entry = JOptionPane.showInputDialog(null, "Enter talk minutes needed");
        talk = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null, "Enter text messages needed");
        text = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null, "Enter gigabytes of data needed");
        data = Integer.parseInt(entry);
        int price;
        String plan;
        if(data > 0)
            if(data <= DATA_MIN)
            {
                plan = "E";
                price = PRICE_E;
            }
            else
            {
                plan = "F";
                price = PRICE_F;
            }
        else
            if(talk <= TALK_MIN)
                if(text == 0)
                {
                    plan = "A";
                    price = PRICE_A;
                }
                else
                {
                    plan = "B";
                    price = PRICE_B;
                }
            else
                if(text <= TEXT_MIN)
                {
                    plan = "C";
                    price = PRICE_C;
                }
                else
                {
                    plan = "D";
                    price = PRICE_D;
                }
        String message;
        message = "Plan" + plan + " $" + price + "per month";
        JOptionPane.showMessageDialog(null, message);
    }
}