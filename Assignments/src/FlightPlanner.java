import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlightPlanner {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Flight Planner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(null);
        
        // Destination City Label and List
        JLabel destinationLabel = new JLabel("Destination City");
        destinationLabel.setBounds(20, 20, 100, 20);
        frame.add(destinationLabel);

        String[] cities = {"Oakland", "Sacramento", "San Jose", "San Francisco", "Eureka"};
        JList<String> cityList = new JList<>(cities);
        JScrollPane cityScroll = new JScrollPane(cityList);
        cityScroll.setBounds(20, 50, 120, 80);
        frame.add(cityScroll);

        // Seat Location Label and ComboBox
        JLabel seatLabel = new JLabel("Seat Location");
        seatLabel.setBounds(160, 20, 100, 20);
        frame.add(seatLabel);

        String[] seats = {"Window", "Middle", "Aisle"};
        JComboBox<String> seatComboBox = new JComboBox<>(seats);
        seatComboBox.setBounds(160, 50, 100, 25);
        frame.add(seatComboBox);

        // Meal Preference Label and ComboBox
        JLabel mealLabel = new JLabel("Meal Preference");
        mealLabel.setBounds(280, 20, 100, 20);
        frame.add(mealLabel);

        String[] meals = {"Vegetarian", "Non-Vegetarian", "Kosher", "Halal"};
        JComboBox<String> mealComboBox = new JComboBox<>(meals);
        mealComboBox.setBounds(280, 50, 100, 25);
        frame.add(mealComboBox);

        // Assign Button
        JButton assignButton = new JButton("Assign");
        assignButton.setBounds(100, 150, 100, 30);
        frame.add(assignButton);

        // Exit Button
        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(220, 150, 100, 30);
        frame.add(exitButton);

        // Assign Button Action
        assignButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCity = cityList.getSelectedValue();
                String selectedSeat = (String) seatComboBox.getSelectedItem();
                String selectedMeal = (String) mealComboBox.getSelectedItem();

                if (selectedCity != null) {
                    JOptionPane.showMessageDialog(frame,
                            "Destination: " + selectedCity + "\nSeat Location: " + selectedSeat + "\nMeal: " + selectedMeal,
                            "Your Assignment", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a destination city!", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Exit Button Action
        exitButton.addActionListener(e -> System.exit(0));

        // Set frame visibility
        frame.setVisible(true);
    }
}


