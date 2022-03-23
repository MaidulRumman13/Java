package Maidul2;
import java.io.*;
public class Program16_3 {
    public static void main(String arg[])
    {
        // Create an input file system
        FileInputStream infile = null;
        int b;
        try
        {
            // Connect Infile stream to the required file 
            infile = new FileInputStream (arg [0]);
            
            //Read and disply
            while ((b = infile.read()) !=-1)
            {
                System.out.print ((char)b);
            }
            infile.close ( );
        }
        catch(IOException ieo)
        {
            System.out.println(ieo);
        }
    }
}
