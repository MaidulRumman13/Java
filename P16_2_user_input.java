package Maidul2;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class P16_2_user_input {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        File outfile = new File("OutFile.txt");
        try{
            PrintWriter output= new PrintWriter( outfile);

            int i=0;
            String name;
            int id;
            System.out.print("Nuber of Student: ");

            int numberStudent = scan.nextInt();
            
            for( i=0; i<numberStudent; i++)
            {
            	scan.nextLine();
                System.out.print("Input Name: ");
            	name = scan.nextLine();
           	output.println(name);
            	System.out.print("Input ID: ");
            	id = scan.nextInt();
            	output.println(id);
            }

            output.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}
