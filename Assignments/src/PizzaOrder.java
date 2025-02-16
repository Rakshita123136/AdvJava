import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaOrder {
    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Pizza Order");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        // Size Panel
        JPanel sizePanel = new JPanel(new GridLayout(1, 0));
        sizePanel.setBorder(BorderFactory.createTitledBorder("Size"));
        JRadioButton smallSize = new JRadioButton("Small");
        JRadioButton mediumSize = new JRadioButton("Medium");
        JRadioButton largeSize = new JRadioButton("Large");
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallSize);
        sizeGroup.add(mediumSize);
        sizeGroup.add(largeSize);
        sizePanel.add(smallSize);
        sizePanel.add(mediumSize);
        sizePanel.add(largeSize);

        // Crust Panel
        JPanel crustPanel = new JPanel(new GridLayout(2, 1));
        crustPanel.setBorder(BorderFactory.createTitledBorder("Crust"));
        JRadioButton thinCrust = new JRadioButton("Thin Crust");
        JRadioButton thickCrust = new JRadioButton("Thick Crust");
        ButtonGroup crustGroup = new ButtonGroup();
        crustGroup.add(thinCrust);
        crustGroup.add(thickCrust);
        crustPanel.add(thinCrust);
        crustPanel.add(thickCrust);

        // Toppings Panel
        JPanel toppingsPanel = new JPanel(new GridLayout(3, 3));
        toppingsPanel.setBorder(BorderFactory.createTitledBorder("Toppings"));
        JCheckBox extraCheese = new JCheckBox("Extra Cheese");
        JCheckBox mushrooms = new JCheckBox("Mushrooms");
        JCheckBox onions = new JCheckBox("Onions");
        JCheckBox greenPeppers = new JCheckBox("Green Peppers");
        JCheckBox olives = new JCheckBox("Olives");
        JCheckBox tomatoes = new JCheckBox("Tomatoes");
        toppingsPanel.add(extraCheese);
        toppingsPanel.add(mushrooms);
        toppingsPanel.add(onions);
        toppingsPanel.add(greenPeppers);
        toppingsPanel.add(olives);
        toppingsPanel.add(tomatoes);

        // Dine-in or Take-out Panel
        JPanel dinePanel = new JPanel(new GridLayout(1, 1));
        dinePanel.setBorder(BorderFactory.createTitledBorder("Dine Options"));
        JRadioButton takeOut = new JRadioButton("Take Out");
        JRadioButton dineIn = new JRadioButton("Dine In");
        ButtonGroup dineGroup = new ButtonGroup();
        dineGroup.add(takeOut);
        dineGroup.add(dineIn);
        dinePanel.add(takeOut);
        dinePanel.add(dineIn);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        JButton buildPizzaButton = new JButton("Build Pizza");
        JButton exitButton = new JButton("Exit");
        buttonPanel.add(buildPizzaButton);
        buttonPanel.add(exitButton);

        // Adding Panels to Frame
        JPanel leftPanel = new JPanel(new GridLayout(4, 1, 11, 11));
        leftPanel.add(sizePanel);
        leftPanel.add(crustPanel);
        leftPanel.add(dinePanel);

        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(toppingsPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Action Listener for Build Pizza Button
        buildPizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder order = new StringBuilder();
                order.append("Your Pizza:\n");

                // Size
                if (smallSize.isSelected()) order.append("Small Pizza\n");
                if (mediumSize.isSelected()) order.append("Medium Pizza\n");
                if (largeSize.isSelected()) order.append("Large Pizza\n");

                // Crust
                if (thinCrust.isSelected()) order.append("Thin Crust\n");
                if (thickCrust.isSelected()) order.append("Thick Crust\n");

                // Dine Option
                if (takeOut.isSelected()) order.append("Take Out\n");
                if (dineIn.isSelected()) order.append("Dine In\n");

                // Toppings
                order.append("Toppings:\n");
                if (extraCheese.isSelected()) order.append("- Extra Cheese\n");
                if (mushrooms.isSelected()) order.append("- Mushrooms\n");
                if (onions.isSelected()) order.append("- Onions\n");
                if (greenPeppers.isSelected()) order.append("- Green Peppers\n");
                if (olives.isSelected()) order.append("- Olives\n");
                if (tomatoes.isSelected()) order.append("- Tomatoes\n");

                // Show Order
                JOptionPane.showMessageDialog(frame, order.toString(), "Your Pizza", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Action Listener for Exit Button
        exitButton.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}
