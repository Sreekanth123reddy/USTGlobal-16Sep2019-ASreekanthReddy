package com.ust.empwebapp.dao;

public class EmployeeDaoManager {

	private EmployeeDaoManager() {
		
	}
	public static EmployeeDAO  getEmployeeDAO() {
		return new EmployeeDaoJdbcImpl();
	}
}
