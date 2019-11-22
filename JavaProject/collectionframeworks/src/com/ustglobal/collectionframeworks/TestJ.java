package com.ustglobal.collectionframeworks;

import java.util.ArrayList;

public class TestJ {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	Student s1 = new Student(4098, "A Sreekanth Reddy");
	Student s2 = new Student(4099 , "Rashmika Mandana");
	Student s3 = new Student(4100 ,"Rashi khanna");
	Student s4 = new Student(5213 , "Shahid kapoor");
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	
	for(int i =0;i<al.size();i++)
	{
	Student s = al.get(i);
	System.out.println("Name is"+s.name);
	System.out.println("Id is "+s.id);
	}
	System.out.println("=======================");
}
}
