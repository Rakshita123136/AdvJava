import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class click1 extends JFrame implements ActionListener {
    JButton bl;

    public click1() {
        JFrame f = new JFrame("HELLO");
        bl = new JButton("Click Me");
        bl.addActionListener(this);
        bl.setBounds(200, 200, 250, 100);
        bl.setFont(new Font("Arial", Font.PLAIN, 40));
        f.add(bl);
        f.setSize(700, 700);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String text = e.getActionCommand();
        if (e.getSource() == bl) {
            bl.setText("hello");
        }
        if (text.equals("Click Me")) {
            bl.setText("TYIT");
            bl.setForeground(Color.BLUE);
        } else {
            bl.setText("Click Me");
        }
    }

    public static void main(String args[]) {
        click1 b = new click1();
    }
}
