package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataBaseGettingServlet extends HttpServlet{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs =null;
			String eid = req.getParameter("search");
			try {
				//Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/ust_db";
				con = DriverManager.getConnection(url,"root","root");
				
				String sql= "select * from employee_info where id=?";
				pstmt = con.prepareStatement(sql);
				int empid = Integer.parseInt(eid);
				pstmt.setInt(1,empid);
				rs = pstmt.executeQuery();
				if(rs.next())
				{
					int emp_id = rs.getInt("id");
					String name = rs.getString("name");
					int sal = rs.getInt("sal");
					String gender =rs.getString("gender");
					
					PrintWriter out =resp.getWriter();
					
					out.println("<table>");
					out.println("<tr>");
					out.println("<td>"+emp_id+"</td>");
					out.println("<td>"+name+"</td>");
					out.println("<td>"+sal+"</td>");
					out.println("<td>"+gender+"</td>");
					out.println("</tr>");
					out.println("</table>");
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(con!=null)
					{
						con.close();
					}
					if(pstmt!=null)
					{
						pstmt.close();
					}
					if(rs!=null)
					{
						rs.close();
					}
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}


		}
		}
