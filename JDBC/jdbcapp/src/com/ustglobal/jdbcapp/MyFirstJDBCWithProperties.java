package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCWithProperties {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs =null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			String url = prop.getProperty("url");
			
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			con = DriverManager.getConnection(url, prop);
			stmt = con.createStatement();
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
				if(reader!=null)
				{
					reader.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}//end of main

}
