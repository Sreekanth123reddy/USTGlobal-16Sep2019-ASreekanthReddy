package com.ustglobal.sorting.set;

public class Customer implements Comparable<Customer> {
	int id;
	String name;
	double salary;
	public Customer(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Customer o) {
		String s1 = this.name;
		String s2 = o.name;
		
		return s1.compareTo(s2);
	}
	
}
