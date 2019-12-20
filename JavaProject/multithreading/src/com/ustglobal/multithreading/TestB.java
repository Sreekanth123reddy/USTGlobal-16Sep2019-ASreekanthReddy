package com.ustglobal.multithreading;

public class TestB {
public static void main(String[] args) {
	System.out.println("Main-starts");
	MyRunnable m = new MyRunnable();
	//m.start(); start() is undefined in MyRunnable
	Thread t1= new Thread(m);
	t1.start();
	for (int i = 0; i < 10; i++) {
		System.out.println("Main-Threaad");
	}
	System.out.println("main-ends");
	
	
}
}
