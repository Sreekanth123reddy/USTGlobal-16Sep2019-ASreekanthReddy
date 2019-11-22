package com.ustglobal.multithreading;

public class TestA {
public static void main(String[] args) {
	System.out.println("Main Started");
	MyThread t1 = new MyThread();
	t1.start();
		/*
		 * don't call run() method , it behaves like a normal program
		 * all code will execute inside main thread only
		 */	
	//t1.run(); 
	for(int i=0;i<10;i++)
	{
		System.out.println("Main Thread");
	}
	//t1.start(); we get IllegalThreadStateException if we again call start() method

	System.out.println("Main ended");
}
}
