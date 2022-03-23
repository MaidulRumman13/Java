
package Maidul2;
import java.util.*;
public class P18_1_ArrayListExample {
    public static void main(String args[])
    {
        ArrayList arraylist = new  ArrayList();
        System.out.println("Initial size of arraylist " +arraylist.size());
        arraylist.add("A");
        arraylist.add("B");
        arraylist.add("C");
        arraylist.add("D");
        System.out.println("Size of arraylist after adding the element " +arraylist.size());
        System.out.println("Contents of arraylist" +arraylist);
        arraylist.add(2, "E");
        System.out.println("Changed contents of arraylist by adding element at the given index: " +arraylist);
        

    }
}
