import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create the main frame (window) of the application
        JFrame frame = new JFrame("Factorial Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a panel with GridBagLayout to hold and arrange components
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Number Label and TextField
        JLabel numberLabel = new JLabel("Enter a Number:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(numberLabel, gbc);

        JTextField numberField = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(numberField, gbc);

        // Calculate Button
        JButton calculateButton = new JButton("Calculate");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(calculateButton, gbc);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(numberField.getText());
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                JOptionPane.showMessageDialog(frame, "Factorial of " + number + " is " + factorial, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Exit Button
        JButton exitButton = new JButton("Exit");
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(exitButton, gbc);
        exitButton.addActionListener(e -> System.exit(0));

        // Add the panel to the frame
        frame.add(panel);
        // Make the frame visible
        frame.setVisible(true);
    }
}
