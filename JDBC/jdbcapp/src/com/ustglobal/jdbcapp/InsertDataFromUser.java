package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class InsertDataFromUser {
public static void main(String[] args) {
	Connection con =null;
	PreparedStatement pstmt = null;
	try {
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/ust_db?user=root&password=root";
		con = DriverManager.getConnection(url);
		
		String sql = "insert into employee_info values(?,?,?,?)";
		pstmt = con.prepareStatement(sql);
		String empid = args[0];
		int id = Integer.parseInt(empid);
		pstmt.setInt(1,id);
		String name = args[1];
		pstmt.setString(2, name);
		String salary = args[2];
		int sal = Integer.parseInt(salary);
		pstmt.setInt(3, sal);
		String gender = args[3];
		pstmt.setString(4, gender);
		
		int count = pstmt.executeUpdate();
		System.out.println(count + "row(s) updated");
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(con!=null)
			{
				
				con.close();
			}
			if(pstmt!=null)
			{
				pstmt.close();
			}
			
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}
}
}
