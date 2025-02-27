package DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        try (PrintWriter out = resp.getWriter()) {
            // Retrieve parameters from the request
            String uname = req.getParameter("uname");
            String pass = req.getParameter("pass");

            // Log the received parameters for debugging
            Logger.getLogger(Login1.class.getName()).log(Level.INFO, "Received parameters: uname={0}, pass={1}", new Object[]{uname, pass});

            MyDB db = new MyDB();
            Connection con = db.getCon();

            if (con != null) {
                Statement stmt = con.createStatement();

                int result = stmt.executeUpdate("INSERT INTO register (name, password) VALUES ('" + uname + "','" + pass + "')");
                if (result > 0) {
                    out.println("Data Inserted Successfully");
                } else {
                    out.println("Failed to insert data");
                }

                // Close the connection
                con.close();
            } else {
                out.println("Failed to establish connection to the database");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
