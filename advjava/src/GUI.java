import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI frame = new GUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public GUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridBagLayout());

        JTextArea txtrWelcomeToJava = new JTextArea();
        txtrWelcomeToJava.setText("Welcome to Java");
        GridBagConstraints gbc_txtWelcomeToJava = new GridBagConstraints();
        gbc_txtWelcomeToJava.insets = new Insets(0, 0, 5, 0);
        gbc_txtWelcomeToJava.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtWelcomeToJava.gridx = 0;
        gbc_txtWelcomeToJava.gridy = 0;
        contentPane.add(txtrWelcomeToJava, gbc_txtWelcomeToJava);

        JButton btnHello = new JButton("Hello");
        btnHello.setBackground(new Color(240, 240, 240));
        GridBagConstraints gbc_btnHello = new GridBagConstraints();
        gbc_btnHello.gridx = 0;
        gbc_btnHello.gridy = 1;
        contentPane.add(btnHello, gbc_btnHello);
    }
}
