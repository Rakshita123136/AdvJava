import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleGeometry {
    public static void main(String[] args) {
        // Create the main frame (window) of the application
        JFrame frame = new JFrame("Circle Geometry");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a panel with GridBagLayout to hold and arrange components
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Enter Diameter Label and TextField
        JLabel diameterLabel = new JLabel("Enter Diameter:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(diameterLabel, gbc);

        JTextField diameterField = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(diameterField, gbc);

        // Computed Circumference Label
        JLabel circumferenceLabel = new JLabel("Computed Circumference:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(circumferenceLabel, gbc);

        // Circumference output
        JLabel circumferenceOutput = new JLabel();
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(circumferenceOutput, gbc);

        // Computed Area Label
        JLabel areaLabel = new JLabel("Computed Area:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(areaLabel, gbc);

        // Area output
        JLabel areaOutput = new JLabel();
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(areaOutput, gbc);

        // Compute button
        JButton computeButton = new JButton("Compute");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(computeButton, gbc);
        computeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double diameter = Double.parseDouble(diameterField.getText());
                double circumference = Math.PI * diameter;
                double area = Math.PI * Math.pow(diameter / 2, 2);
                circumferenceOutput.setText(String.format("%.2f", circumference));
                areaOutput.setText(String.format("%.2f", area));
            }
        });

        // Add the panel to the frame
        frame.add(panel);
        // Make the frame visible
        frame.setVisible(true);
    }
}
