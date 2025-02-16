import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickChecker {
    public static void main(String[] args) {
        // Create the main frame (window) of the application
        JFrame frame = new JFrame("Button Click Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel to hold buttons
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create 4 buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        // Add action listeners to buttons
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                JOptionPane.showMessageDialog(frame, clickedButton.getText() + " was clicked!", "Button Clicked", JOptionPane.INFORMATION_MESSAGE);
            }
        };

        button1.addActionListener(buttonListener);
        button2.addActionListener(buttonListener);
        button3.addActionListener(buttonListener);
        button4.addActionListener(buttonListener);

        // Add buttons to panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        // Add panel to frame
        frame.add(panel);
        // Make the frame visible
        frame.setVisible(true);
    }
}
