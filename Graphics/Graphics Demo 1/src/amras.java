import javax.swing.*;
import java.awt.*;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras extends Canvas {
    public static void main(String[] args){
    JFrame win = new JFrame("Graph");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        amras canvas = new amras();
        win.add(canvas);
        win.setVisible(true);


    }


    public void paint(Graphics g){
        g.setColor(Color.green);
        g.drawRect(50,20,100,200);
        g.fillOval(160,20,100,200);
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20);
        g.drawOval(200,430,200,100);
        g.setColor(Color.black);

        g.drawString("Graphics are pretty neat", 500,100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }
}
