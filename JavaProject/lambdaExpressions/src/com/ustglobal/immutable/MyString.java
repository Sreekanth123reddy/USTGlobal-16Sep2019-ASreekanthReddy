package com.ustglobal.immutable;

public final class MyString {
private final int rollno;
private final String name;
public MyString(int rollno , String name)
{
	this.rollno = rollno;
	this.name = name;
}

public int getRollNo()
{
	return rollno;
}
public String getName()
{
	return name;
}
public MyString changeContent(int rollNo , String name)
{
	MyString m =new MyString(rollNo, name);
	return m;
}

}
