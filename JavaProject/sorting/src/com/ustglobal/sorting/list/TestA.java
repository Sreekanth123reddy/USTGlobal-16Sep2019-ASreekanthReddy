package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class TestA {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	Student s1 = new Student(4100, "Manogna", 85.9);
	Student s2 = new Student(4123 , "Kavya" , 87.0);
	Student s3 = new Student(4153, "Mamatha", 36.9);
	Student s4 = new  Student(4144, "kavitha", 65.9);
	
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	System.out.println("Before sorting---->");
	displayStudentDetails(al);
	Collections.sort(al);
	System.out.println("After Sorting--->");
	displayStudentDetails(al);
}
static void displayStudentDetails(ArrayList<Student> al)
{
	Iterator<Student> it = al.iterator();
	while(it.hasNext())
	{
		Student obj= it.next();
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.percentage);
	}
}

}
