package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;

		try
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			String url = "jdbc:mysql://localhost:3306/ust_db?user=root&password=root";
			con = DriverManager.getConnection(url);
			
			String sql ="update employee_info set name ='RamCharan' ,sal=50000,gender='M' where id =6";
			stmt = con.createStatement();
			
			int count = stmt.executeUpdate(sql);
			System.out.println(count+" Rows(1) updated");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if(con!=null)
				{
					con.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
