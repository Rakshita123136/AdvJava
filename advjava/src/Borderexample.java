import java.awt.*;  
import javax.swing.*;  

// Demonstrates the use of BorderLayout in Java Swing  
public class Borderexample {  
    JFrame f;  

    Borderexample() {  
        f = new JFrame();  

        // Creating buttons to be placed in different regions of BorderLayout  
        JButton b1 = new JButton("NORTH");  
        JButton b2 = new JButton("SOUTH");  
        JButton b3 = new JButton("EAST");  
        JButton b4 = new JButton("WEST");  
        JButton b5 = new JButton("CENTER");  

        // Adding buttons to the frame using BorderLayout  
        // BorderLayout positions components in five regions: NORTH, SOUTH, EAST, WEST, and CENTER  
        f.add(b1, BorderLayout.NORTH);   // Places button at the top  
        f.add(b2, BorderLayout.SOUTH);   // Places button at the bottom  
        f.add(b3, BorderLayout.EAST);    // Places button at the right side  
        f.add(b4, BorderLayout.WEST);    // Places button at the left side  
        f.add(b5, BorderLayout.CENTER);  // Places button in the center  

        // Setting frame size and making it visible  
        f.setSize(300, 300);  
        f.setVisible(true);  
    }  

    public static void main(String[] args) {  
        // Creating an instance of Borderexample to display the UI  
        new Borderexample();  
    }  
}

