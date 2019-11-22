package com.ustglobal.studentdata.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.studentdata.dto.StudentBean;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public List<StudentBean> getAllStudentData() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ust_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			String sql = "select * from student_info";
			stmt = conn.createStatement();
			rs= stmt.executeQuery(sql);
			ArrayList<StudentBean> result = new ArrayList<StudentBean>();
			while(rs.next()) {
				StudentBean bean = new StudentBean();
				int regno = rs.getInt("regno");
				bean.setRegno(regno);
				String name = rs.getString("name");
				bean.setName(name);
				double percentage = rs.getDouble("percentage");
				bean.setPercentage(percentage);
				result.add(bean);

			}
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			try {
				if(conn!=null)
				{
					conn.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public	int[] insertStudentData() {
		String url = "jdbc:mysql://localhost:3306/ust_db?user=root&password=root";
		String sql ="insert into student_info values(?,?,?)";
		try(FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in);
				Connection con =DriverManager.getConnection(url);
				PreparedStatement pstmt = con.prepareStatement(sql)){
			while(reader.ready())
			{
				String line = reader.readLine();
				String[]  datas = line.split(",");
				int id = Integer.parseInt(datas[0]);
				String name = datas[1];
				int percentage = Integer.parseInt(datas[2]);
				
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, percentage);
				
				pstmt.addBatch();
			
			} //end of while loop
			int[] counts = pstmt.executeBatch();
			return counts;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}//end of try catch block
	}
}
