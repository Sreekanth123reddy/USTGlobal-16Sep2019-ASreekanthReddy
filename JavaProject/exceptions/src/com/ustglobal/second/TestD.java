package com.ustglobal.second;

import java.util.Scanner;

public class TestD {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in)){
		int age = sc.nextInt();
		System.out.println("age "+age);
		System.out.println(age/0);
		}
	catch(ArithmeticException ae) {
		ae.printStackTrace();
	} finally {
		System.out.println("finally executed");
	}
}
}
