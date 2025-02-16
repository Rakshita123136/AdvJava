import java.sql.*;
public class dbexample1 {

	public static void main(String[] args) 
	{
		try {
			//load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Creating a connection
			String url = "jdbc:mysql://localhost:3306/mydb1";
			String username = "root";
			String password = "rakshita25";
			Connection con = DriverManager.getConnection(url,username,password);
		if(con.isClosed()) {
			System.out.println("Connection closed");
		}else {
			System.out.println("Connection created");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
