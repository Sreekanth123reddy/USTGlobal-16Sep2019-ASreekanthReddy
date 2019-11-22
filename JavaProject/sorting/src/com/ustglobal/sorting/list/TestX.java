package com.ustglobal.sorting.list;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestX {
public static void main(String[] args) {
	Comparator<Employee> comp = (e1,e2) -> {
		if(e1.height > e2.height)
		{
			return 1;
		}else if(e1.height  < e2.height)
		{
			return -1;
		}else {
			return 0;
		}
	};
	
	TreeSet<Employee> ts = new TreeSet<Employee>(comp);
	Employee e1 = new Employee(4, "A Sreekanth Reddy", 5.6);
	Employee e2 = new Employee(1, "Bhaskar Reddy", 5.2);
	Employee e3 = new Employee(2, "Sunil", 6.3);
	Employee e4 = new  Employee(5, "Dinesh", 4.5);
	
	
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);
	
	System.out.println("**********Using Iterator**********");
	
	Iterator<Employee> it = ts.iterator();
	while(it.hasNext())
	{
		Employee e  = it.next();
		System.out.println("Name is"+e.name);
		System.out.println("Id is"+e.id);
		System.out.println("Height is"+e.height);
		System.out.println("=======================");
	}
}



}
