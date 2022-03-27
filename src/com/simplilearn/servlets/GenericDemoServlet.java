package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello")
public class GenericDemoServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// All business logic
		
		PrintWriter out = res.getWriter();
		
		out.println("<html><body>");

		out.println("<p> Hello World </p>");
		out.println("Current Time:"+new Date());
		out.println("</body></html>");
	}

}
