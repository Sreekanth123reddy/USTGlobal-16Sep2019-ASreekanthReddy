package com.ustglobal.arrays;
public class TestC {
public static void main(String[] args) {
	Student s1 = new Student(1, "Priya", 63.90);
	Student s2 = new Student(2,"Nitya" ,65.9);
	Student s3 = new Student(3,"Anushka" , 96.9);
	
	Student[] stu = new Student[3];
	stu[0] = s1;
	stu[1] = s2;
	stu[2] = s3;
	
	for(Student s :stu)
	{
		System.out.println(s);
	}
	receive(stu);
	
}
static void receive(Student[] stu)
{
	for(Student s :stu)
	{
		System.out.println(s);
	}
}
}
