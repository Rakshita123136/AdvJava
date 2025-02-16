import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class combodemo1 extends JFrame implements ItemListener {
    JLabel l;
    JComboBox<String> cb;

    // Constructor
    public combodemo1() {
        init(); // Call the init() method in the constructor
    }

    // Method to initialize the GUI components
    public void init() {
        JFrame f = new JFrame("Combo box");
        f.setLayout(new FlowLayout());

        // Create JComboBox and add items
        cb = new JComboBox<>();
        cb.addItem("france");
        cb.addItem("germany");
        cb.addItem("italy");
        cb.addItem("japan");
        cb.addItemListener(this);

        // Add JComboBox to the frame
        f.add(cb);

        // Create JLabel and add it to the frame
        l = new JLabel(new ImageIcon("C:\\Users\\JYOTIKA\\eclipse-workspace\\advjava\\src\\imageicon\\france.gif"));
        f.add(l);

        // Set frame properties
        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // Update the icon based on selected item
        String s = (String) e.getItem();
        l.setIcon(new ImageIcon("C:\\Users\\JYOTIKA\\eclipse-workspace\\advjava\\src\\imageicon\\" + s + ".gif"));
    }

    public static void main(String[] args) {
        new combodemo1(); // Create an instance of the class
    }
}

