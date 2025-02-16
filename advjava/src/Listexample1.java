import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Listexample1 extends JFrame implements ActionListener {
    JLabel label;
    JButton b;
    JList<String> list;

    Listexample1() {
        // Use a JPanel with BorderLayout to manage positions
        JPanel panel = new JPanel(new BorderLayout());

        label = new JLabel();
        b = new JButton("Show");
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("C");
        l1.addElement("C++");
        l1.addElement("Java");
        l1.addElement("PHP");
        list = new JList<>(l1);

        // Use a JPanel for buttons and list
        JPanel listPanel = new JPanel();
        listPanel.setLayout(new FlowLayout());
        listPanel.add(list);
        listPanel.add(b);

        panel.add(label, BorderLayout.NORTH);  // Add label to the top
        panel.add(listPanel, BorderLayout.CENTER); // Add list and button to the center
        
        add(panel);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String data = "";
        if (list.getSelectedIndex() != -1) {
            data = "Programming language selected: " + list.getSelectedValue();
            label.setText(data);
        }
    }

    public static void main(String[] args) {
        new Listexample1();
    }
}
