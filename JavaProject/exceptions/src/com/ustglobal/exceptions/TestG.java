package com.ustglobal.exceptions;

public class TestG {
public static void main(String[] args) {
	System.out.println("Main Started");
	PayTm p = new PayTm();
	try {
	p.book();
	}
	catch (ArithmeticException e) {
		System.out.println("Exception caught in main");
	}
	finally {
		System.out.println("Executing finallly block");
	}
	System.out.println("Main ended");
}
}
