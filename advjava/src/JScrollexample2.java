import java.awt.*;
import javax.swing.*;
public class JScrollexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a new JFrame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//create a JPanel with flow layout
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		//create a JTextArea and wrap it in a JScrollpanel
		JTextArea textarea = new JTextArea(20,30);//passing parameter in JTextArea(20,30)
		JScrollPane scroll = new JScrollPane(textarea,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//add the Jscrollpane to the panel
		panel.add(scroll);
		
	// set the panel as the content pane of the frame
		frame.setContentPane(panel);
		//set the size, location,,and visibility of the frame
		frame.setSize(430,430);
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
	}

}
