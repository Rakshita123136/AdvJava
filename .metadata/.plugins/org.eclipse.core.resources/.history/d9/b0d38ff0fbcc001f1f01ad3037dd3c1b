import java.awt.event.*;
import javax.swing.*;
//journal 1: write a java program to print the text in textfield when button
public class actionbutton extends JFrame implements ActionListener
{ 
	JButton b;
	JTextField tf;
	public actionbutton() 
	{
		JFrame f = new JFrame("button example");
		tf = new JTextField();
		tf.setBounds(50,50,150,20);
		b = new JButton("Click me");
		b.setBounds(50,100,95,30);
		b.addActionListener(this);
		tf.setEnabled(false);
		f.add(b);
		f.add(tf);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		  
		  	 if(e.getSource()==b) 
		  	 {
		  		 tf.setEnabled(true);
		  		 tf.setText("Welcome to javatpoint");
		  	 }
		   
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new actionbutton();
	}

}
