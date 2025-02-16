import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NEWmenuexample1 implements ActionListener {
    JFrame f;                   // Frame to hold the components
    JMenuBar mb;                // Menu bar to hold menus
    JMenu file, edit, help;     // Menus: File, Edit, Help
    JMenuItem cut, copy, paste, selectAll; // Menu items for Edit menu
    JTextArea ta;               // Text area for text input

    NEWmenuexample1() {
        f = new JFrame();       // Create a new frame
        
        // Initialize menu items and add action listeners
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");
        
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        
        mb = new JMenuBar();    // Create a new menu bar
        
        // Initialize menus
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        
        // Add menu items to Edit menu
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        
        // Add menus to menu bar
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        
        ta = new JTextArea();  // Create a new text area
        ta.setBounds(5, 5, 360, 320);  // Set position and size of text area
        
        f.add(ta);  // Add text area to frame
        f.setJMenuBar(mb);  // Set menu bar to frame
        f.setLayout(null);  // Set layout to null
        f.setSize(400, 400);  // Set size of frame
        f.setVisible(true);  // Make frame visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut) {
            ta.cut();  // Cut selected text
        } else if (e.getSource() == copy) {
            ta.copy();  // Copy selected text
        } else if (e.getSource() == paste) {
            ta.paste();  // Paste text from clipboard
        } else if (e.getSource() == selectAll) {
            ta.selectAll();  // Select all text
        }
    }

    public static void main(String[] args) {
        new NEWmenuexample1();  // Create an instance of NEWmenuexample1
    }
}

