package Maidul2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
public class P16_2_Read_File {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            FileReader rdr = new FileReader("outFile.txt");
            Scanner fin = new Scanner(rdr);
            int i=0;
            String name;
            String id;
            System.out.print("Nuber of Student: ");
            int numberStudent = scan.nextInt();

            for( i=0; i<numberStudent; i++)
            {
            	name = fin.nextLine();
            	System.out.println("Input Name: "+name);
            	id = fin.nextLine();
            	System.out.println("Input ID: "+id);
            }

            rdr.close();
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }
}
