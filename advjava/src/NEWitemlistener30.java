import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NEWitemlistener30 extends JFrame implements  ItemListener{
	JCheckBox checkbox1,checkbox2;
	JLabel label;
	NEWitemlistener30(){
		//Creating Frame
		JFrame f = new JFrame();
		f.setLayout(null);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Create JLabel
		label = new JLabel();
		label.setBounds(100,200,200,50);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		f.add(label);
		//Create Checkboxes
		checkbox1 = new JCheckBox("C++");
		checkbox1.setBounds(100,50,100,50);
		f.add(checkbox1);
		checkbox2 = new JCheckBox("java");
		checkbox2.setBounds(100,100,100,50);
		f.add(checkbox2);
		//add ItemListeners to checkBoxes
		checkbox1.addItemListener(this);
		checkbox2.addItemListener(this);
		f.setVisible(true);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == checkbox1) {
			label.setText("C++ Checkbox: " +(e.getStateChange()== ItemEvent.SELECTED? "Checked" : "Unchecked"));
			}else if(e.getSource()== checkbox2) {
				label.setText("Java Checkbox :" +(e.getStateChange()== ItemEvent.SELECTED? "Checked" : "Unchecked"));
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NEWitemlistener30();
	}

}
