package com.ustglobal.empwebapp.util;

import com.ustglobal.empwebappp.dao.EmployeeDAO;
import com.ustglobal.empwebappp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {
	private EmployeeDaoManager() {
		
		
	}
	
	public static EmployeeDAO getEmployeeDAO(){
		return new EmployeeDaoJdbcImpl();
	}
}
