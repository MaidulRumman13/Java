package Maidul2;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class P12_5_GUI_ShowBorderLayout extends JFrame {
    public P12_5_GUI_ShowBorderLayout(){
        setLayout(new BorderLayout(5, 10));
        
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("Center"), BorderLayout.CENTER);
    }
    
    public static void main(String[] args)
    {
        P12_5_GUI_ShowBorderLayout frame = new P12_5_GUI_ShowBorderLayout();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
