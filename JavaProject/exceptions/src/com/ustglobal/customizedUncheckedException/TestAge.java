package com.ustglobal.customizedUncheckedException;

public class TestAge {
public static void main(String[] args) {
	System.out.println("Main Started");
	Validator v = new Validator();
	try {
	v.Verify(12);
	} catch (CustomizedException e) {
		System.out.println("Exception occured");
	}
	 v.Verify(13);
	System.out.println("MainEnded");
}
}
