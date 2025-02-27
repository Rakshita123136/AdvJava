package DB;
import java.sql.*;
import java.util.logging.*;
public class MyDB 
{
	Connection con;
	public Connection getCon()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//add username and password
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","rakshita25");
			
		}
		
		catch (ClassNotFoundException ex)
		{
			Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null ,ex);
		}
		catch(SQLException ex)
		{
			Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null ,ex);
			
		}
		return con;
	}

}