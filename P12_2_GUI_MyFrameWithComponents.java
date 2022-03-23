package Maidul2;
import javax.swing.*;
public class P12_2_GUI_MyFrameWithComponents {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("MyFrameWithComponents");
        //Add a button into the frame
        JButton jbtOK = new JButton("OK");
        frame.add(jbtOK);
        
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
