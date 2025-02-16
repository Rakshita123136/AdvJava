import java.sql.*;
//write a jdbc program to create a table in jdbc.
public class jdbcexample2 {

	public static void main(String[] args) {
		try {
			//load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Creating a connection
			String url = "jdbc:mysql://localhost:3306/mydb1";
			String username = "root";
			String password = "rakshita25";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			//create a query
			String q = "create table student(id int(20) primary key auto_increment,name varchar(200) not null, city varchar(400))";
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table created in database");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
