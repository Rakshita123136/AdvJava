 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
public class NEWdialogexample extends JFrame implements ActionListener
{
		JDialog d;
		JButton b;
		JLabel l;
		NEWdialogexample(){
			JFrame f = new JFrame();
			d = new JDialog(f ,"Dialog Example" ,true);
			d.setLayout(new FlowLayout());
			JButton b = new JButton("OK");
			b.addActionListener(this);
			l = new JLabel("Click button to continue");
			d.add(l);
			d.add(b);
			d.setSize(300,300);
			d.setVisible(true);
		}
		

	@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try {
				d.setVisible(false);

			}catch(Exception ie) {
				System.out.print(ie);
			}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NEWdialogexample();
	}

}
