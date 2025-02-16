import javax.swing.*;
import java.awt.event.*;

public class KeyListenerexample32 extends JFrame implements KeyListener {
    JLabel label;
    JTextArea textArea;

    // Constructor
    KeyListenerexample32() {
        // Initialize components
        label = new JLabel();
        label.setBounds(20, 50, 200, 20);
        textArea = new JTextArea();
        textArea.setBounds(20, 80, 300, 300);

        // Add KeyListener
        textArea.addKeyListener(this);

        // Add components to the frame
        add(label);
        add(textArea);

        // Set frame properties
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        label.setText("Key Typed :" + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        label.setText("Key Pressed :" + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        label.setText("Key Released :" + e.getKeyChar());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new KeyListenerexample32();
    }
}
