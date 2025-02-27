package Welcome;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		out.println("<h2>Welcome to register Servlet</h2>");
		String name=req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String cond = req.getParameter("Condition");
		
		if(cond != null) {
			if(cond.equals("checked")) {
				out.println("<h2>Name :" +name+"</h2>");
				out.println("<h2>Password :" +password+"</h2>");
				out.println("<h2>Email :" +email+"</h2>");
				out.println("<h2>Gender :" +gender+"</h2>");
				out.println("<h2>course :" +course+"</h2>");
				RequestDispatcher rd= req.getRequestDispatcher("SuccessServlet");
				rd.forward(req,resp);
				
			}else {
				out.println("<h1>You have not accepted Terms and conditions</h2>");
			}
		}else {
			out.println("<h1>You have not accepted Terms and conditions</h2>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}
	}
		
	
	
}
