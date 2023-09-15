public class Main
{
    public static void main(String[] args)
    {
        int balance = 5000;
        double tax = 0.17;
        double month1 = 0;
        double month2 = 0;

        month1 = (balance * tax) + balance;
        month2 = (month1 * tax) + month1;

        System.out.println("Your toltal after one month is " + month1 + ", and after two months is " + month2);
    }
}