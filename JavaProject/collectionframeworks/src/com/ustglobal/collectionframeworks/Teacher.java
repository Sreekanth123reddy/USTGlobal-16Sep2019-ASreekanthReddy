package com.ustglobal.collectionframeworks;

public class Teacher 
{
	int id;
	String name;
	String dept;
	long salary;

	public Teacher(int id, String name, String dept, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
}
