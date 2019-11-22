package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO{
	public List<EmployeeBean> getAllEmployeeData(){
	String url ="jdbc:mysql://localhost:3306/ust_db?user=root&password=root";
	String sql ="select * from employee_info";
	Connection conn= null;
	Statement stmt = null;
	ResultSet rs =null;

	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url);
		
		stmt = conn.createStatement();
		rs= stmt.executeQuery(sql);
		ArrayList<EmployeeBean> result = new ArrayList<>();
		
		while(rs.next()) {
			EmployeeBean bean = new EmployeeBean();
			
			int id = rs.getInt("id");
			bean.setId(id);
			
			String name = rs.getString("name");
			bean.setName(name);
			
			int sal = rs.getInt("sal");
			bean.setSal(sal);
			
			String gender = rs.getString("gender");
			bean.setGender(gender);
			
			result.add(bean);
			} //end of while loop
		return result;

	} catch (Exception e) {
		e.printStackTrace();
		return null;
	} //end of try -catch block
	finally {
		try { if(conn!=null)
		{
			conn.close();
		}
		if(stmt!=null)
		{
			stmt.close();
		}
		if(rs!=null)
		{
			rs.close();
		}


		} catch (Exception e2) {
			e2.printStackTrace();
		} //end of try-catch block
	} //end of finally


}//end of getAllEmployeeData
	
	public EmployeeBean searchEmployeeData(int id)
	{
		String url ="jdbc:mysql://localhost:3306/ust_db?user=root&password=root";
		String sql ="select * from employee_info where id =?";
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con =  DriverManager.getConnection(url);
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				return bean;
			}
			else {
				return null;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			
		} finally {
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
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
			} //end of try catch block
		}
		
	}

	@Override
	public int insertEmployeeData(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployeeData(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployeeData(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}//end of class
