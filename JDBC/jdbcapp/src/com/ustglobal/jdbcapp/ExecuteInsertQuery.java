package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
public static void main(String[] args) {
	Connection con = null;
	Statement stmt = null;
	
	try {
		//step 1 load the driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		//step2 get connection
		String url = "jdbc:mysql://localhost:3306/ust_db?user=root&password=root";
		con	= DriverManager.getConnection(url);
		//Step3 Issue sql query
		
		String sql = "insert into employee_info values(7,'Pawankalyan',100000,'M')";
		stmt = con.createStatement();
		
		int count = stmt.executeUpdate(sql);
		//Step 4 Read the result
		System.out.println(count + "Row(s) inserted");
	}catch (SQLException e) {
		e.printStackTrace();
	}
		finally {
			//Step 5 close all JDBC Objects
			try {
				if(con!=null)
				{
					con.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}//end of main()
}//end of execute query
