import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password extends JFrame implements ActionListener {
    JTextField text;
    JLabel label;
    JPasswordField value;
    JButton b;

    public Password() {
        JFrame f = new JFrame("Password field Example");
        JLabel l1 = new JLabel("Username");
        l1.setBounds(20, 20, 80, 30);
        text = new JTextField();
        text.setBounds(100, 20, 100, 30);
        JLabel l2 = new JLabel("Password");
        l2.setBounds(20, 75, 80, 30);
        value = new JPasswordField();
        value.setBounds(100, 75, 100, 30);
        b = new JButton("Login");
        b.setBounds(100, 120, 80, 30);
        label = new JLabel("Hi");
        label.setBounds(20, 150, 450, 50);

        // Add components to the frame
        f.add(l1);
        f.add(l2);
        f.add(text);
        f.add(value);
        f.add(b);
        f.add(label);

        // Set frame properties
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add action listener to the button
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String data = "Username: " + text.getText();
            data += ", Password: " + new String(value.getPassword());
            label.setText(data);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new Password();
    }
}
