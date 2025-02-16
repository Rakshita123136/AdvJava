import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class NEWradioexample extends JFrame implements ItemListener {
    JRadioButton r1, r2, r3;
    ButtonGroup bgrp;
    JTextField t1;

    public NEWradioexample(String title) {
        super(title);
        JFrame f = new JFrame("Radio Button example");
        f.setLayout(new FlowLayout());
        r1 = new JRadioButton("r1");
        r2 = new JRadioButton("r2");
        r3 = new JRadioButton("r3");
        bgrp = new ButtonGroup();
        bgrp.add(r1);
        bgrp.add(r2);
        bgrp.add(r3);
        t1 = new JTextField(15);
        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(t1);
        f.setSize(600, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton jrb = (JRadioButton) e.getItem();
        t1.setText(jrb.getText());
    }

    public static void main(String[] args) {
        new NEWradioexample("Example");
    }
}

