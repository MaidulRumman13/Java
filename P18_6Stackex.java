package Maidul2;

import java.util.*;

public class P18_6Stackex {
    public static void main(String args[])
    {
        Stack st = new Stack();
        st.push("Java");
        st.push("laster");
        st.push("Edition");
        st.push(".fifth");
        System.out.println("The elements in the Stack: " +st);
        System.out.println("The element at top: " +st.peek());
        System.out.println("The elements poped out of the Stack: " +st.pop());
        System.out.println("The elements in the Stack after popp out an element: " +st);
        System.out.println("The result of searching: " +st.search("r u"));
    }
}
