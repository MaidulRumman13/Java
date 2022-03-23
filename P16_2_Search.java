package Maidul2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
public class P16_2_Search {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            FileReader rdr = new FileReader("outFile.txt");
            Scanner fin = new Scanner(rdr);
            String name;
            String id;
            int c =0;
            System.out.print("What do you want to search?: ");
            String search = scan.nextLine();

            while(fin.hasNextLine())
            {
                name = fin.nextLine();
                id = fin.nextLine();
                
                if( search.equals(name)){
                    System.out.println("Name: "+name);
                    System.out.println("ID: "+id);
                    c=1;
                }
            }
            if(c==0){
                System.out.println("Not Found");
            }
            rdr.close();
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }
}
