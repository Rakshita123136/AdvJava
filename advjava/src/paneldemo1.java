import javax.swing.*;
import java.awt.*;

public class paneldemo1  {
	paneldemo1(){
		JFrame f = new JFrame("JPANEL EXAMPlE");
		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);
		JButton b1 = new JButton("Button 1");
		b1.setBounds(50, 100, 80, 30);
		b1.setBackground(Color.yellow);
		JButton b2 = new JButton("Button 2");
		b2.setBounds(100, 100, 80, 30);
		b2.setBackground(Color.MAGENTA);
		panel.add(b1);
		panel.add(b2);
		f.add(panel);
		f.setSize(400,400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new paneldemo1();
	}

}
