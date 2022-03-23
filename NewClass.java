package Maidul2;

public class NewClass {
    public static void main(String arg [])
    {
        int a = 10;
        int b = 5;
        int c = 5;
        try
        {
            int x = a/(b-c); //Division by zero
            System.out.println("x = "+x);
            int y = a/(b);
            System.out.println("y = "+y);
        }
        catch(Exception e)
        {
            System.out.println("Division by Zero. "+e);
        }   
        finally
        {
            int y = a/(b+c);
            System.out.println("y = "+y);
        }
    }
}
