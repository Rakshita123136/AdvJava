import javax.swing.*;
public class NEWJTabelexample {
	JFrame f;
	NEWJTabelexample(){
		f = new JFrame();
		String data[][]= {{"101","Amit","670000"},
							{"102","Jai","780000"},
							{"103","Sachin","700000"}};
		String column[]= {"ID","NAME","SALARY"};
		JTable jt = new JTable(data,column);
		jt.setBounds(30,40,200,300);
		JScrollPane sp = new JScrollPane(jt);
		f.add(sp);
		f.setSize(330,300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NEWJTabelexample();
	}

}
