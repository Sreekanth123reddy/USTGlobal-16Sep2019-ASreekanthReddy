package com.ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
public static void main(String[] args) {
	Employee e1= new Employee(12, "A Sreekanth Reddy", 45000);
	Employee e2 = new Employee(2,"Sai Pavan", 45000);
	Employee e3  = new Employee(3, "Uday", 78000);
	Employee e4 = new Employee(5, "Manoj",15000);
	Employee e5 = new Employee(4,"Jay" , 45698);
	
	ArrayList<Employee> al = new ArrayList<Employee>();
	al.add(e1);
	al.add(e2);
	ArrayList<Employee> al1 = new ArrayList<Employee>();
	al1.add(e3);
	al1.add(e4);
	al1.add(e5);
	
	
	HashMap<String,ArrayList<Employee>> hm = new HashMap<>();
	hm.put("Shireesha" , al);
	hm.put("Gowtham", al1);
	
	
	ArrayList<Employee> gowtham = hm.get("Gowtham");
	
	Iterator<Employee> it = gowtham.iterator();
	while(it.hasNext())
	{
		Employee e = it.next();
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
		System.out.println("----------------");
	}
}
}
