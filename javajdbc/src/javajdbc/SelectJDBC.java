package javajdbc;

import java.sql.*;

public class SelectJDBC {

	public static void main(String[] args) {
		try {
			Connection con = ConnectionProvider.getConnection();
			String q = "select * from student";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);
				System.out.println(id+"."+name+"."+city);
				
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}