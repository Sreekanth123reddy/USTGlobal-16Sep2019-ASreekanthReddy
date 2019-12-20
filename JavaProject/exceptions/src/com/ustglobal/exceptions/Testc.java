package com.ustglobal.exceptions;
public class Testc {
public static void main(String[] args) {
	System.out.println("main started");
	int a[]= {200,30,40};
	int b = 10;
	try {
		System.out.println(a[4]);
		System.out.println(b/0);
	}
	catch (ArithmeticException e) {
		System.out.println("number divide by zero");
	}
	catch (ArrayIndexOutOfBoundsException ae) {
		System.out.println("array index is not present");
	}
}

}
