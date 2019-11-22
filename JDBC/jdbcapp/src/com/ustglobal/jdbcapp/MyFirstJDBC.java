package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs =null;
		try {
			//step1
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			//step2 Get the Connection
			String url = "jdbc:mysql://localhost:3306/ust_db";  //"jdbc:mysql://localhost:3306/ust_db?user=root&password=root"
			con = DriverManager.getConnection(url,"root","root");
			stmt = con.createStatement();
			//step3 issue sql query
			String sql= "select * from employee_info where sal<15000";
			rs = stmt.executeQuery(sql);
			//Read the result
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender =rs.getString("gender");

				System.out.println("Id : "+id);
				System.out.println("Name :"+name);
				System.out.println("Salary :"+sal);
				System.out.println("Gender :"+gender);
				System.out.println("***************");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			//close all jdbc objects
			try {
				if(con!=null)
				{
					con.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
				if(rs!=null)
				{
					rs.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}//end of main
} //end of MyFirstDB
