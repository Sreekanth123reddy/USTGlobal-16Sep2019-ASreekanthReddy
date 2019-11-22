package com.ustglobal.beanobject.bean;

public class TestB {
	public static void main(String[] args) {
		Employee e =new  Employee();
		e.setId(4098);
		e.setSalary(85000);
		e.setName("A Sreekanth Reddy");
		e.setDept(20);
		e.setDesigntion("Developer");
		
		EmployeeDataBase ed =new EmployeeDataBase();
		ed.receive(e);
		
	}

}
