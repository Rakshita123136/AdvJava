import java.awt.*;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

class MyComponent1 extends JComponent {
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(30, 30, 100, 100);
    }
}

public class componentdemo1 {
    public static void main(String[] args) {
        MyComponent1 com = new MyComponent1();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(com);
        frame.setVisible(true);
    }
}

