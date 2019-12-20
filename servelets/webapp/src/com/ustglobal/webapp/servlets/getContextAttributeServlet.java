package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getContextAttributeServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			ServletContext context = getServletContext();
			Object obj1 = context.getAttribute("obj");
			
			PrintWriter out = resp.getWriter();
			
			out.println("<h1>");
			out.println(obj1);
			out.println("</h1>");

			
	}//end of doGet
} //end of get contextAttributeServlet
