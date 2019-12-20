package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCustomerWithComparator {
public static void main(String[] args) {
	SortByName1 sb = new SortByName1();
	TreeSet<Customer1> ts = new TreeSet<Customer1>(sb);
	Customer1 c1 = new Customer1("Sreekanth", 5, 4500);
	Customer1 c2 = new Customer1("Balaji",2 , 45678);
	Customer1 c3 = new Customer1("Revanth" , 1 , 56789);
	Customer1 c4 = new Customer1("Jyothi" ,4 , 344567);
	ts.add(c1);
	ts.add(c2);
	ts.add(c3);
	ts.add(c4);
	
	Iterator<Customer1> it=ts.iterator();
	while(it.hasNext())
	{
		Customer1 c = it.next();
		System.out.println(c.id);
		System.out.println(c.name);
		System.out.println(c.salary);
	}
}
}

