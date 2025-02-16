import javax.swing.*;
import java.awt.event.*;
public class NEWoption29 extends WindowAdapter {
	JFrame f;
	NEWoption29(){
		f = new JFrame();
		f.addWindowListener(this);
		f.setSize(300,300);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setVisible(true);
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		int a = JOptionPane.showConfirmDialog(f,"Are you sure?");
		if (a == JOptionPane.YES_OPTION) {
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NEWoption29();
	}

}
