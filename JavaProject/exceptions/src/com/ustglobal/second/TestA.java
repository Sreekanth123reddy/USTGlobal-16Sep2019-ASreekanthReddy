package com.ustglobal.second;

public class TestA {
public static void main(String[] args) {
	System.out.println("Mai started");
	try {
		System.out.println("Inide try");
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		System.out.println("Exception caught");
		e.printStackTrace();
	}
	System.out.println("Main ended");
}
}
