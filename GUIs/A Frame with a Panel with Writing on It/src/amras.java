
import javax.swing.*;
import java.awt.*;

/**
 * Created by KAAN on 14/05/2016.
 */
public class amras {
    public static void main(String[] args) {
        Frame613 f = new Frame613();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

     static class Frame613 extends JFrame {
        public Frame613() {
            setTitle("613 rocks!");
            setSize(300, 200);
            setLocation(100, 200);

            Panel1613 panel = new Panel1613();
            Container cp = getContentPane();
            cp.add(panel);
        }
    }

    static class Panel1613 extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString("Hi", 75, 100);
        }
    }

}
