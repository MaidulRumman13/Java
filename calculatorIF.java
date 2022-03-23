
package Maidul2;

// Java program to create a simple calculator
// with basic +, -, /, * using java swing elements
 
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class calculatorIF extends JFrame implements ActionListener {
    // create a frame
    static JFrame f;
 
    // create a textfield
    static JTextField l;
 
    // store operator and operands
    String s0, s1, s2;
 
    // default constructor
    calculatorIF()
    {
        s0 = s1 = s2 = "";
    }
 
    // main function
    public static void main(String args[])
    {
        // create a frame
        f = new JFrame("calculator");
        
 
        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            
        }
 
        // create a object of class
        calculatorIF c = new calculatorIF();
 
        // create a textfield
        l = new JTextField();
        l.setFont(new Font("Ink free",Font.BOLD,30));
        l.setBackground(Color.red);
 
        // set the textfield to non editable
        l.setEditable(false);
 
        // create number buttons and some operators
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;
 
        // create number buttons
        b0 = new JButton("0");
        b0.setFont(new Font("Ink free",Font.BOLD,30));
        b1 = new JButton("1");
        b1.setFont(new Font("Ink free",Font.BOLD,30));
        b2 = new JButton("2");
        b2.setFont(new Font("Ink free",Font.BOLD,30));
        b3 = new JButton("3");
        b3.setFont(new Font("Ink free",Font.BOLD,30));
        b4 = new JButton("4");
        b4.setFont(new Font("Ink free",Font.BOLD,30));
        b5 = new JButton("5");
        b5.setFont(new Font("Ink free",Font.BOLD,30));
        b6 = new JButton("6");
        b6.setFont(new Font("Ink free",Font.BOLD,30));
        b7 = new JButton("7");
        b7.setFont(new Font("Ink free",Font.BOLD,30));
        b8 = new JButton("8");
        b8.setFont(new Font("Ink free",Font.BOLD,30));
        b9 = new JButton("9");
        b9.setFont(new Font("Ink free",Font.BOLD,30));
 
        // equals button
        beq1 = new JButton("=");
        beq1.setFont(new Font("Ink free",Font.BOLD,30));
 
        // create operator buttons
        ba = new JButton("+");
        ba.setFont(new Font("Ink free",Font.BOLD,30));
        bs = new JButton("-");
        bs.setFont(new Font("Ink free",Font.BOLD,30));
        bd = new JButton("/");
        bd.setFont(new Font("Ink free",Font.BOLD,30));
        bm = new JButton("*");
        bm.setFont(new Font("Ink free",Font.BOLD,30));
        beq = new JButton("C");
        beq.setFont(new Font("Ink free",Font.BOLD,30));
 
        // create . button
        be = new JButton(".");
        be.setFont(new Font("Ink free",Font.BOLD,30));
 
        // create a panel
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2,1,10,10));
 
        // add action listeners
        bm.addActionListener(c);
        bd.addActionListener(c);
        bs.addActionListener(c);
        ba.addActionListener(c);
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        be.addActionListener(c);
        beq.addActionListener(c);
        beq1.addActionListener(c);
 
        // add elements to panel
        p.add(l);
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5,4));
        
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(ba);
        
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(bs);
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(bm);
        
        p1.add(be);
        p1.add(b0);
        p1.add(beq);
        p1.add(bd);
        
        p1.add(beq1);
        
        p.add(p1);
 
        // set Background of panel
        p1.setBackground(Color.CYAN);
 
        // add panel to frame
        f.add(p);
        
 
        f.setSize(400, 420);
        f.show();
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
 
        // if the value is a number
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            // if operand is present then add to second no
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
 
            // set the value of text
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {
            // clear the one letter
            s0 = s1 = s2 = "";
 
            // set the value of text
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {
 
            double te;
 
            // store the value in 1st
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
            // set the value of text
            l.setText(s0 + s1 + s2 + "=" + te);
 
            // convert it to string
            s0 = Double.toString(te);
 
            s1 = s2 = "";
        }
        else {
            // if there was no operand
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            // else evaluate
            else {
                double te;
 
                // store the value in 1st
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
                // convert it to string
                s0 = Double.toString(te);
 
                // place the operator
                s1 = s;
 
                // make the operand blank
                s2 = "";
            }
 
            // set the value of text
            l.setText(s0 + s1 + s2);
        }
    }
}
