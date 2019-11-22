package com.ustglobal.beanobject.bean;

public class EmployeeDataBase {

	void receive(Employee e)
	{
		System.out.println("employee ID is "+e.getId());
		System.out.println("Employee name "+e.getName());
		System.out.println("Employee salary "+e.getSalary());
		System.out.println("Employee dept "+e.getDept());
		System.out.println("Employee designation  "+e.getDesigntion());
	}

}
