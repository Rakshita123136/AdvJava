// journal 3 : write a java program to change the text on button as soon as the button is clicked
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
public class clickme1 extends JFrame implements ActionListener 
{
	JButton b1;
	public clickme1() {
		JFrame f = new JFrame("Hello");
		b1 = new JButton();
		b1.addActionListener(this);
		b1.setBounds(200,200,250,100);
		b1.setFont(new Font ("Arial",Font.PLAIN,40));
		f.add(b1);
		f.setSize(700,700);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text =(String)e.getActionCommand();
		if(text.equals("Click Me")) {
			b1.setText("TYIT");
			b1.setForeground(Color.blue);
		}else {
			b1.setText("click me");
		}
	}
	public static void main(String args[]) {
		clickme1 b  = new clickme1();
	}
}