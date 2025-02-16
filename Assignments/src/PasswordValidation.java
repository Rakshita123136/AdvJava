import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordValidation {
    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("Password Validation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.WHITE);

        // Label
        JLabel label = new JLabel("Please Enter Your Password:");
        label.setBounds(80, 20, 200, 20);
        frame.add(label);

        // Password Field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(80, 50, 180, 25);
        frame.add(passwordField);

        // Validate Button
        JButton validateButton = new JButton("Validate");
        validateButton.setBounds(80, 90, 90, 30);
        frame.add(validateButton);

        // Exit Button
        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(180, 90, 90, 30);
        frame.add(exitButton);

        // Correct Password
        String correctPassword = "admin123";  // Set your own password

        // Validate Button Action
        validateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredPassword = new String(passwordField.getPassword());

                if (enteredPassword.equals(correctPassword)) {
                    JOptionPane.showMessageDialog(frame, "You've passed security!", "Access Granted", JOptionPane.WARNING_MESSAGE);
                } else {
                    int response = JOptionPane.showConfirmDialog(frame, "Incorrect password - Try Again?", "Access Denied", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                    if (response == JOptionPane.NO_OPTION) {
                        System.exit(0);
                    }
                }
            }
        });

        // Exit Button Action
        exitButton.addActionListener(e -> System.exit(0));

        // Set frame visibility
        frame.setVisible(true);
    }
}

