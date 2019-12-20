package com.ustglobal.stringclass;

public class TestA {
	public static void main(String[] args) {
		String s1="aishu";
		String s2="deepika";

		String s3 = new String("aishu");
		String s4 = new String("aishu");
		String s5="aishu";

		/*
		 * System.out.println(s1==s2); //false 
		 * System.out.println(s3==s4); //false
		 * System.out.println(s1==s5);
		 *///true
		System.out.println(s1.equals(s2)); //false
		System.out.println(s3.equals(s4));	//true
		System.out.println(s1.equals(s5));  //true

		String s6 = s1.toUpperCase();
		System.out.println(s6);
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		char c1 = s1.charAt(0);
		System.out.println(c1);
		
		boolean b = s1.equalsIgnoreCase("AISHu");
		System.out.println(b);
	}
}
