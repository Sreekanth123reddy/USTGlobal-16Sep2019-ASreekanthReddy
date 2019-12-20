package com.ustglobal.sorting.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestEmployee {
public static void main(String[] args) {
	HashSet<Employee> hs = new HashSet<Employee>();
	hs.add(new Employee(4098, "A Sreekanth Reddy", 100000));
	hs.add(new Employee(4098, "A Sreekanth Reddy", 100000));
	hs.add(new Employee(4099, " Reddy", 100000));
	hs.add(new Employee(4096, "Swaminathan", 100000));


	System.out.println("*****************Using iterator*********************");
	//Collections.sort(hs);
	Iterator<Employee> it = hs.iterator();
	while(it.hasNext())
	{
		Employee s = it.next();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.salary);
	}
}
}
