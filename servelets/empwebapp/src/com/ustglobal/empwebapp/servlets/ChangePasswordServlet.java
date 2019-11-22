package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;
import com.ustglobal.empwebappp.dao.EmployeeDAO;
@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session!=null)
		{
			String pass = req.getParameter("password");
			
			String confirmpass =req.getParameter("conformpassword");
			
			if(pass.equals(confirmpass)) {
				EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");
			EmployeeDAO dao =EmployeeDaoManager.getEmployeeDAO();
			dao.changPassword(info.getId(),pass);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
			dispatcher.forward(req, resp);
			}else {
				PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<h4>Password is not matching</h4>");
				out.println("</html>");
				RequestDispatcher dispatcher = req.getRequestDispatcher("/changepassword.html");
				dispatcher.include(req, resp);
			}
			
		}else {
			RequestDispatcher dispatcher =req.getRequestDispatcher("/login.html");
			dispatcher.forward(req, resp);
			
		}
			
	}//end of doPost

}//end of changePasswordServlet
