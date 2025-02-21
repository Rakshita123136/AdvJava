package first;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet1 implements Servlet{
	ServletConfig config;
	@Override
	public void destroy() {
		System.out.println("servlet object is destroyed");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return config;
	}

	@Override
	public String getServletInfo() {
		
		return "Create  By Students of Java Class ";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("Servlet is initialized..");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("servicing...");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>You have Clicked First Servlet</b>");
		out.print("<h1>Today Date and Time" +new Date(0).toString()+"</h>");
		
	}

}
