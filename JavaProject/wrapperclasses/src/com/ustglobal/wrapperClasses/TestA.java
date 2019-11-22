package com.ustglobal.wrapperClasses;

public  class TestA 
{
	 class TestB
	{
		
	}
	public static void main(String[] args) {
		int a =10 ;
		System.out.println("a is "+a);
		Integer i =a;	//Boxing or Auto Boxing
		System.out.println("i is "+i);
		Boolean b= new Boolean(false);
		System.out.println(b);
		
		Integer x =20;
		Integer z =new Integer(20);
		System.out.println("x is "+x);
		int y = x;	//Un boxing or auto-unboxing
		System.out.println("y is "+y);
		
		int value = Integer.parseInt("123");
		System.out.println("value is" +value);
		boolean res = Boolean.parseBoolean("true");
		System.out.println("Result is "+res);
		boolean result = Boolean.parseBoolean("123False");
		System.out.println("result is "+result);
	}
}
