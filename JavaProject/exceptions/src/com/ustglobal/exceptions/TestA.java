package com.ustglobal.exceptions;
public class TestA 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Started");

		int a[]= {20,30,40};

		System.out.println(a[1]);
		try {
			System.out.println(a[2]);
			System.out.println(a[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is not present");
		}
		System.out.println("Main ended");

	}
}
