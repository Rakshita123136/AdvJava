import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class NEWfilechooser24 extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu file;
    JMenuItem open;
    JTextArea ta;

    NEWfilechooser24() {
        open = new JMenuItem("Open File");
        open.addActionListener(this);
        
        file = new JMenu("File");
        file.add(open); // Add open JMenuItem to file JMenu

        mb = new JMenuBar();
        mb.setBounds(0, 0, 800, 20); // Adjust the height to properly fit the JMenuBar
        mb.add(file);

        ta = new JTextArea();
        ta.setBounds(0, 20, 800, 780); // Adjust the bounds to fit within the JFrame

        setLayout(null); // Set layout manager to null
        add(mb);
        add(ta);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == open) {
            JFileChooser fc = new JFileChooser();
            int i = fc.showOpenDialog(this);
            if (i == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    ta.read(br, null);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        NEWfilechooser24 om = new NEWfilechooser24();
        om.setSize(300, 300);
        om.setVisible(true);
        om.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
