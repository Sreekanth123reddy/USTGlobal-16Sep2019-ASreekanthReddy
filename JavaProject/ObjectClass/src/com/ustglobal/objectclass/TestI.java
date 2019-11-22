package com.ustglobal.objectclass;

public class TestI {
public static void main(String[] args) throws CloneNotSupportedException {
	Person p = new Person(22, "A Sreekanth Reddy");
	System.out.println("Person age :"+p.age);
	System.out.println("Person name :"+p.name);
	
	Object o = p.clone();
	Person p2 = (Person) o;
	System.out.println("person age is "+p2.age);
	System.out.println("Person name is"+p2.name);
	
	p2.age=21;
	p2.name="sreekamth";
	
	System.out.println("-----------------After Cloning-----------------");
	System.out.println("perosn age :"+p.age);
	System.out.println("Person name :"+p.name);
	System.out.println("Person 2 age :"+p2.age);
	System.out.println("Person 2 name :"+p2.name);
	
}
}
