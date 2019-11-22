package com.ustglobal.studentdata;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.studentdata.dao.StudentDAO;
import com.ustglobal.studentdata.dto.StudentBean;
import com.ustglobal.studentdata.util.StudentFactory;

public class StudentApp {
public static void main(String[] args) {
	System.out.println("Press 1 to Display Student Data");
	System.out.println("Press 2 to insert Student data");
	System.out.println("press 3 to update Student data");
	System.out.println("Press 4 to delete student data");
	System.out.println("press 5 to Search Student data");
	Scanner scan = new Scanner(System.in);
	int ch = scan.nextInt();
	switch (ch) {
	case 1:
		StudentDAO dao = StudentFactory.getStudentDAO();
		List<StudentBean> result = dao.getAllStudentData();
		for(StudentBean bean : result)
		{
			System.out.println("ID :"+bean.getRegno());
			System.out.println("Name :"+bean.getName());
			System.out.println("Percentage :"+bean.getPercentage());
			System.out.println("***************");
		}
		
		break;
	case 2:StudentDAO dao1 = StudentFactory.getStudentDAO();
			int a[]=dao1.insertStudentData();
			System.out.println(a.length+"rows inserted successfully");
		
		break;
	case 3:
		
		break;
	case 4:
		
		break;
	case 5:
		
		break;
	
	}
	scan.close();
}
}
