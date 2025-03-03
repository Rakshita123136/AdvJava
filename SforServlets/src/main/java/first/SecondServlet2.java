package first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet2 extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("This is servlet using generic servlet");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<h1>This is my Second servlet using generic servlet</h1>");
    }
}
