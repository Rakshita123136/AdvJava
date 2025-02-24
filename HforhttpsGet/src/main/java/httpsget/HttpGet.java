package httpsget;  // Ensure this matches the folder name

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpGet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Servlet NewServlet</title></head>");
        out.println("<body>");
        out.println("<h4>Hello " + req.getParameter("tName") + ", Welcome to the world of Java Web Development!</h4>");
        out.println("</body>");
        out.println("</html>");
    }
}
