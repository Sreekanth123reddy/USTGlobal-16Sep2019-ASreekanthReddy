package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCustomerWithComparable {
public static void main(String[] args) {
	TreeSet<Customer> ts = new TreeSet<Customer>();
	Customer c1 = new Customer(5, "Sreekanth", 4500.36);
	Customer c2 = new Customer(2,"Balaji" , 456789.0);
	Customer c3 = new Customer(1 , "Revanth" , 56789.2);
	Customer c4 = new Customer(4 ,"Jyothi" , 344567.9);
	ts.add(c1);
	ts.add(c2);
	ts.add(c3);
	ts.add(c4);
	
	Iterator<Customer> it=ts.iterator();
	while(it.hasNext())
	{
		Customer c = it.next();
		System.out.println(c.id);
		System.out.println(c.name);
		System.out.println(c.salary);
	}
}
}
