package Maidul2;
import java.io.FileOutputStream;
import java.io.IOException;
public class ClassWork1 {
    public static void main(String[] args){
        byte nameid[] = {'M', 'A', 'I', 'D', 'U',  'L',' ', 'I', 'S', 'L', 'A', 'M', '\n', 'I', 'D', ':', '1', '8',
            '1', '4', '7','2', '5', '8', '6','\n'
        };
        FileOutputStream outfile = null;
        try{
            outfile = new FileOutputStream("nameid.txt");
            outfile.write(nameid);
            outfile.close();
        }catch(IOException ioe){
            System.out.println(ioe);
            System.exit(-1);
        }
 
   }
}
