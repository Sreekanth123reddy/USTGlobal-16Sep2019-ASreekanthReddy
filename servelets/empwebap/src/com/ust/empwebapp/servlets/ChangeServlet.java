package com.ust.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ust.empwebapp.dao.EmployeeDAO;
import com.ust.empwebapp.dao.EmployeeDaoManager;
import com.ust.empwebapp.dto.EmployeeInfo;
@WebServlet("/change")
public class ChangeServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if(session!=null) {
			String pass = req.getParameter("password");
			
			String confirmpass = req.getParameter("conformpassword");
			if(pass.equals(confirmpass)) {
				EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");
			EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
			dao.changePassword(info.getId(),pass);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
			dispatcher.forward(req, resp);
			}else {
				String msg = "password not matching";
				req.setAttribute("msg", msg);
				
				RequestDispatcher dispatcher  = req.getRequestDispatcher("/change.jsp");
				dispatcher.forward(req, resp);
			}
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
	
	}
}