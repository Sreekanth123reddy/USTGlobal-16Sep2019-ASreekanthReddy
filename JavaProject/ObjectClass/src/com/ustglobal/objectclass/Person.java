package com.ustglobal.objectclass;

public class Person implements Cloneable {
	int age;
	String name;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
}
