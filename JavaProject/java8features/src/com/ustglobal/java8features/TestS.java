package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestS {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(new Student(4098, "A Sreekanth reddy", 88.3));
	al.add(new Student(4063, "Priya", 36.6));
	al.add(new Student(7896, "K uday", 89.7));
	al.add(new Student(5698, "Tharun", 35.9));
	al.add(new Student(3069, "D Saipavan", 49.7));
	
	Helper h = new Helper();
	//h.displayAllStudents(al);
	//h.displayFailedStudents(al);
	//h.displayPassedStudents(al);
	h.displayTopperOfTheClass(al);
	
	
}
}
