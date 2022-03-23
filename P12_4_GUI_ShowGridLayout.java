package Maidul2;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class P12_4_GUI_ShowGridLayout extends JFrame{
    public P12_4_GUI_ShowGridLayout(){
        setLayout(new GridLayout(5, 2, 5, 5));
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
        add(new JLabel("ID"));
        add(new JTextField(8));
        add(new JButton("OK"));
        
    }
    
    public static void main(String[] args)
    {
        P12_4_GUI_ShowGridLayout frame = new P12_4_GUI_ShowGridLayout();
        frame.setTitle("ShowGridLayout");
        frame.setSize(200, 125);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
