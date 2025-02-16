import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NEWmouse31 extends JFrame implements MouseListener{
	JLabel label;
	NEWmouse31(){
		//create JFrame
		setTitle("Mouse Listener Example");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		//create JLabel
		label = new JLabel();
		label.setBounds(50,150,300,50);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		add(label);
		//Add MouseListener to JFrame
		addMouseListener(this);
		setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Mouse Clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Mouse Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Mouse Released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Mouse Entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Mouse Exited");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NEWmouse31();
	}

}
