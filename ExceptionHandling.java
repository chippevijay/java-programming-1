import java.util.Scanner;

class ExceptionHandeling
{
    public static void task()
    {
        double a = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of a : ");

        try
        {
            a = scan.nextDouble();
            double value = (2.0/3.0)*(a);
            System.out.println(value);
        }
        catch (Exception e)
        {
            System.out.println("Wrong input - Please enter a number");
        }
    }

    public static void main(String[] args)
    {
        //System.out.println("start");
        task();
        //System.out.println("End");
    }

}