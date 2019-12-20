package com.ustglobal.objectclass;

public class TestG {
public static void main(String[] args) {
	Employee e1= new Employee(1, "sreekanth reddy", 45000);
	Employee e2 = new Employee(2,"Jay",56000);
	Employee e3 = new Employee(1, "sreekanth reddy", 45000);
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e3));
}
}
