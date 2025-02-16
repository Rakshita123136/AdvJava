import javax.swing.*;
import java.awt.*;

// class GridLayoutDemo extends JFrame
public class gridExample1 extends JFrame {

    gridExample1() {

        // Creating Object P1 of JPanel class
        JPanel p1 = new JPanel();

        // Set the layout of P1 to GridLayout with 4 rows and 2 columns
        p1.setLayout(new GridLayout(4, 2));

        // Creating Object of "FlowLayout" class
        FlowLayout layout = new FlowLayout();

        // Creating Object P2 of JPanel class
        JPanel p2 = new JPanel();

        // Set the layout of P2 to FlowLayout
        p2.setLayout(layout);

        // Declaration of objects of JLabel class
        JLabel one, two, three, four;

        // Declaration of objects of JTextField class
        JTextField tname, tsalary, tcode, tdesig;

        // Declaration of objects of JButton class
        JButton buttonSave, buttonExit;

        // Initialization of object "one" of JLabel class
        one = new JLabel("NAME");

        // Initialization of object "tname" of JTextField class
        tname = new JTextField(20);

        // Initialization of object "two" of JLabel class
        two = new JLabel("CODE");

        // Initialization of object "tcode" of JTextField class
        tcode = new JTextField(20);

        // Initialization of object "three" of JLabel class
        three = new JLabel("DESIGNATION");

        // Initialization of object "tdesig" of JTextField class
        tdesig = new JTextField(20);

        // Initialization of object "four" of JLabel class
        four = new JLabel("SALARY");

        // Initialization of object "tsalary" of JTextField class
        tsalary = new JTextField(20);

        // Initialization of object "buttonSave" of JButton class
        buttonSave = new JButton("SAVE");

        // Initialization of object "buttonExit" of JButton class
        buttonExit = new JButton("EXIT");

        // Adding JLabel "one" to JPanel P1
        p1.add(one);

        // Adding JTextField "tname" to JPanel P1
        p1.add(tname);

        // Adding JLabel "two" to JPanel P1
        p1.add(two);

        // Adding JTextField "tcode" to JPanel P1
        p1.add(tcode);

        // Adding JLabel "three" to JPanel P1
        p1.add(three);

        // Adding JTextField "tdesig" to JPanel P1
        p1.add(tdesig);

        // Adding JLabel "four" to JPanel P1
        p1.add(four);

        // Adding JTextField "tsalary" to JPanel P1
        p1.add(tsalary);

        // Adding JButton "buttonSave" to JPanel P2
        p2.add(buttonSave);

        // Adding JButton "buttonExit" to JPanel P2
        p2.add(buttonExit);

        // Adding JPanel P1 to the North region of the JFrame
        add(p1, "North");

        // Adding JPanel P2 to the South region of the JFrame
        add(p2, "South");

        // Function to set visible status of JFrame
        setVisible(true);

        // Set size of JFrame
        this.setSize(500, 180);
    }

    // Main Method
    public static void main(String args[]) {
        // Calling the constructor
        new gridExample1();
    }
}
