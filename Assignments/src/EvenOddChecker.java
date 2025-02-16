import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Create the main frame (window) of the application
        JFrame frame = new JFrame("Even or Odd Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a panel with GridBagLayout to hold and arrange components
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Create a label, text field, and button
        JLabel label = new JLabel("Enter a number:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Check");

        // Add components to the panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(label, gbc);
        gbc.gridx = 1;
        panel.add(textField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(button, gbc);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(textField.getText());
                    if (number % 2 == 0) {
                        JOptionPane.showMessageDialog(frame, "The number is Even.");
                    } else {
                        JOptionPane.showMessageDialog(frame, "The number is Odd.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add panel to frame and set frame visibility
        frame.add(panel);
        frame.setVisible(true);
    }
}
