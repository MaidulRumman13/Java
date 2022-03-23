
package Maidul2;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

import java.awt.FlowLayout;

public class P12_3_GUI_ShowFlowLayout extends JFrame{
    public P12_3_GUI_ShowFlowLayout(){
        //set flowlayout, aligned left with horizontal gap 20
        //and vertical  gam 20 between components
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        
        //add labels and text field to the frame
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }
    
    public static void main(String[] args)
    {
        P12_3_GUI_ShowFlowLayout frame = new P12_3_GUI_ShowFlowLayout();
        frame.setTitle("ShowFlowLayout");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
