package com.ustglobal.thread.properties;

public class MyThread extends Thread{

	public static void main(String[] args) {
		System.out.println("Main Started");
		String tname = Thread.currentThread().getName();
		System.out.println("Current Thread name:"+tname);
		Thread.currentThread().setName("Sheik Mohammad Saheb Tahir");
		
		MyThread t1= new MyThread();
		String mname = t1.getName();
		System.out.println("My Thread name :"+mname);
		
		t1.setName("Golu");
		System.out.println("My new Thread name :"+t1.getName());
		
		System.out.println(10/0);
		
		System.out.println("main ended");
	}
}
