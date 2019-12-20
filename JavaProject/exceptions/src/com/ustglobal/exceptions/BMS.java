package com.ustglobal.exceptions;
public class BMS {
public static void main(String[] args) {
	System.out.println("Book my Show started");
	PVR p =new PVR();
	try
	{
		p.book();
		System.out.println("booking confirmed");
	}
	catch (ArithmeticException e) {
		System.out.println("Booking failed");
	}
	System.out.println("Book my show ended");
}
}
