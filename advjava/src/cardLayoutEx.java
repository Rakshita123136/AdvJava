import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cardLayoutEx extends JFrame {
	private int currentCard = 1;
	private CardLayout c1;
	
	public cardLayoutEx() {
		setTitle("Card Layout Example");
		setSize(300,100);
		
		JPanel cardPanel = new JPanel();
		c1 = new CardLayout();
		cardPanel.setLayout(c1);
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		
		JLabel jl1 = new JLabel("Card1");
		JLabel jl2 = new JLabel("Card2");
		JLabel jl3 = new JLabel("Card3");
		JLabel jl4 = new JLabel("Card4");
		
		jp1.add(jl1);
		jp2.add(jl2);
		jp3.add(jl3);
		jp4.add(jl4);
		
		cardPanel.add(jp1,"1");
		cardPanel.add(jp2,"2");
		cardPanel.add(jp3,"3");
		cardPanel.add(jp4,"3");
		
		JPanel buttonPanel = new JPanel();
		
		JButton firstBtn = new JButton("First");
		JButton nextBtn = new JButton("Next");
		JButton previousBtn = new JButton("Pervious");
		JButton lastBtn = new JButton("Last");
		
		buttonPanel.add(firstBtn);
		buttonPanel.add(nextBtn);
		buttonPanel.add(previousBtn);
		buttonPanel.add(lastBtn);
		
		firstBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				c1.first(cardPanel);
				currentCard = 1;
			}
		});
		
		lastBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				c1.last(cardPanel);
				currentCard = 4;
			}
		});
		
		nextBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(currentCard < 4) {
					currentCard += 1;
					c1.show(cardPanel,""+(currentCard));
				}
			}
		});
		
		previousBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(currentCard > 1) {
					currentCard -= 1;
					c1.show(cardPanel,""+(currentCard));
				}
			}
		});
		
		getContentPane().add(cardPanel, BorderLayout.NORTH);
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		
	}

	public static void main(String[] args) {
		cardLayoutEx c1 = new cardLayoutEx();
		c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c1.setVisible(true);
	}

}