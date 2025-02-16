import java.io.*;
import java.sql.*;

public class jdbcexample5 {
    public static void main(String[] args) {
        try {
            // Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Creating a connection
            String url = "jdbc:mysql://localhost:3306/mydb1";
            String username = "root";
            String password = "rakshita25";
            Connection con = DriverManager.getConnection(url,username,password);
            String q = "UPDATE student SET name = ?, city = ? WHERE id = ?";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter the student id: ");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter new name: ");
            String name = br.readLine();
            System.out.println("Enter new city: ");
            String city = br.readLine();
            
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);
            
            pstmt.executeUpdate();
            System.out.println("Updated...");
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
