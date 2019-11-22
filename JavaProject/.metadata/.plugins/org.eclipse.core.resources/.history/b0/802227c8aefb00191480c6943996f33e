package com.ustglobal.exceptions;
public class TestE {
	public static void main(String[] args) {
		System.out.println("main started");
		String s = null;
		int[] a = {10,20,30};
		int b = 10;
		
		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[4]);
			System.out.println(b/0);
		}
		catch (NullPointerException e) {
			System.out.println("Don't play with the  null");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index is not present");
		}
		catch (ArithmeticException e) {
			System.out.println("Divided by zero");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	System.out.println("Main ended");
	}
	
}
