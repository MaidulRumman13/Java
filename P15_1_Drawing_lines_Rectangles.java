package Maidul2;

import java.awt.*;
import javax.swing.JFrame;

public class P15_1_Drawing_lines_Rectangles extends Canvas {

    public void paint(Graphics g) {
//        g.drawLine(10, 10, 50, 50);
//        g.drawRect(10, 60, 40, 30);
//        g.fillRect(60, 10, 30, 80);
//        g.drawRoundRect(10, 100, 80, 50, 10, 10);
//        g.fillRoundRect(20, 110, 60, 30, 5, 5);
//        g.drawLine(100, 100, 5, 500);
//        g.drawLine(100, 140, 230, 10);
//Plus Sign
//        g.drawLine(100, 30, 100, 200);
//        g.drawLine(10, 115, 185, 115);
 
//Multiple sign
//        g.drawLine(10, 10, 200, 200);
//        g.drawLine(200, 10, 10, 200);

        g.setColor(Color.black);
        g.fillRect(10, 30, 10, 340);
        
        g.setColor(new Color(46, 139, 89));
        g.fillRect(20, 40, 300, 170);
        g.setColor(Color.red);
        g.fillOval(70, 65, 120, 120);
    }

    public static void main(String[] args) {
        P15_1_Drawing_lines_Rectangles lr = new P15_1_Drawing_lines_Rectangles();
        JFrame f = new JFrame();
        f.add(lr);
        f.setSize(400, 450);
        f.setVisible(true);
    }
}
