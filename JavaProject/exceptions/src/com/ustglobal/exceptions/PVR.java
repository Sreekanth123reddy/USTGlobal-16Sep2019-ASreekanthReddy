package com.ustglobal.exceptions;
public class PVR {
void book()
{
	try
	{
		System.out.println("Booking started");
		System.out.println(10/1);
		System.out.println("logic for booking");
		System.out.println("Booking confirmed");
		
	}
	catch (ArithmeticException e) {
		System.out.println("Booking failed");
			throw e;
	}
}
}
