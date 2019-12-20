package com.ustglobal.beanobject.bean;

public class TestA {
public static void main(String[] args) {
	Student s = new Student();
	s.setId(4098);
	s.setName("Pujitha");
	s.setRollno(101);
	
	Database db = new Database();
	db.receive(s);
}
}
