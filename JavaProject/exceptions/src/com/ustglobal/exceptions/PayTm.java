package com.ustglobal.exceptions;

public class PayTm {
	void book()
	{
		System.out.println("PayTm Started");
		
		IRCTC i = new IRCTC();
		i.confirm();
		
		System.out.println("Paytm ended");
		
	}
}
