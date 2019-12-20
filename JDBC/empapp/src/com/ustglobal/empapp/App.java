package com.ustglobal.empapp;


import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;


public class App {
	public static void main(String[] args) {

		System.out.println("Press 1 to show all employee data");
		System.out.println("Press 2 to insert  employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete  employee data");
		System.out.println("Press 5 to search single employee data");
		Scanner scan = new Scanner(System.in);
		int ch = scan.nextInt();
		switch(ch)
		{
		case 1:
			EmployeeDAO dao=  EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
			
			for(EmployeeBean bean :result)
			{
				System.out.println("Id :"+bean.getId());
				System.out.println("Name :"+bean.getName());
				System.out.println("Gender :"+bean.getGender());
				System.out.println("Salary :"+bean.getSal());
				System.out.println("*******************");
			}
			break;
		case 2:
			
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter id to search");
			int id = scan.nextInt();
			EmployeeBean bean = dao5.searchEmployeeData(id);
			if(bean!=null)
			{
				System.out.println("Id :"+bean.getId());
				System.out.println("Name :"+bean.getName());
				System.out.println("Gender :"+bean.getGender());
				System.out.println("Salary :"+bean.getSal());
				System.out.println("*******************");
		
			} else {
				System.out.println("No Data Found");
			}
			break;
			
		} //end of switch-case

		scan.close();
	} //end of main
} //end of class
