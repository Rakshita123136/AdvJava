import javax.swing.*;

public class NEWrootpane25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JRootPane root = f.getRootPane();
		//create menubar
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("File");
		bar.add(menu);
		menu.add("Open");
		menu.add("Close");
		root.setJMenuBar(bar);
		root.getContentPane().add(new JButton("Press Me"));
		f.pack();
		f.setVisible(true);
		f.setSize(220,200);
	}

}
