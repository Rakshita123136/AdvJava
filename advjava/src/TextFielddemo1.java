// Import necessary libraries
import javax.swing.*; // For GUI components
import java.awt.event.*; // For handling events

// Main class
public class TextFielddemo1 implements ActionListener {
    // Declare text fields and buttons
    JTextField tf1, tf2, tf3;
    JButton b1, b2;

    // Constructor to set up the GUI
    TextFielddemo1() {
        JFrame f = new JFrame("JTextField Example"); // Create a new frame

        // Create and position the first text field
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);

        // Create and position the second text field
        tf2 = new JTextField();
        tf2.setBounds(50, 80, 150, 20);

        // Create and position the third text field, make it non-editable
        tf3 = new JTextField();
        tf3.setBounds(50, 110, 150, 20);
        tf3.setEditable(false);

        // Create and position the first button (for addition)
        b1 = new JButton(" + ");
        b1.setBounds(50, 150, 50, 50);

        // Create and position the second button (for subtraction)
        b2 = new JButton(" - ");
        b2.setBounds(120, 150, 50, 50);

        // Add action listeners to the buttons
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Add components to the frame
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);

        // Set frame properties
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Define what happens when a button is clicked
    public void actionPerformed(ActionEvent e) {
        try {
            // Get text from the text fields
            String s1 = tf1.getText();
            String s2 = tf2.getText();

            // Convert text to integers
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = 0;

            // Perform addition or subtraction based on the button clicked
            if (e.getSource() == b1) {
                c = a + b;
            } else if (e.getSource() == b2) {
                c = a - b;
            }

            // Set the result in the third text field
            String result = String.valueOf(c);
            tf3.setText(result);

        } catch (NumberFormatException ex) {
            // Handle invalid input
            tf3.setText("Invalid Input");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        new TextFielddemo1(); // Create an instance of the class to show the GUI
    }
}

