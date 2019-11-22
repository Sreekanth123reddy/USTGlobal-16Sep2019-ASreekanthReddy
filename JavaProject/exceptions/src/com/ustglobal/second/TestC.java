package com.ustglobal.second;

public class TestC {
public static void main(String[] args) {
	String s ="hello";
	int[] a = {10,20,30};
	int b = 10;
	try {
		String s1 = s.toUpperCase();
		System.out.println(s1);
		System.out.println(a[7]);
		System.out.println(b/0);
	}catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
}
}
