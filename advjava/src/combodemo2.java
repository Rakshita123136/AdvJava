import javax.swing.*;
import java.awt.event.*;

public class combodemo2 extends JFrame implements ActionListener {
    JFrame f;
    JLabel label; 
    JButton b;
    JComboBox<String> cb;

    combodemo2() {
        f = new JFrame("ComboBox Example");

        // Initialize the combo box and add items
        cb = new JComboBox<>();
        cb.addItem("C");
        cb.addItem("C++");
        cb.addItem("C#");
        cb.addItem("Java");
        cb.addItem("PHP");

        // Set properties of label
        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);

        // Set properties of button
        b = new JButton("Show");
        b.setBounds(200, 100, 75, 20);

        // Add components to the frame
        cb.setBounds(50, 100, 90, 20); // Set bounds for combo box
        f.add(cb);
        f.add(label);
        f.add(b);

        f.setLayout(null);
        f.setSize(350, 350);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update label based on selected item
        String data = "Programming language selected: " + cb.getItemAt(cb.getSelectedIndex());
        label.setText(data);
    }

    public static void main(String[] args) {
        new combodemo2();
    }
}

