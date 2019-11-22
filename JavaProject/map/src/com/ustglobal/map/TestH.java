package com.ustglobal.map;

import java.util.Hashtable;

public class TestH {
public static void main(String[] args) {
	Hashtable<Integer ,String> ht = new Hashtable<Integer,String>();
	ht.put(101,"Ajay Kumar Reddy");
	ht.put(98, "A Sreekanth");
	ht.put(103,"Sonu");
	ht.put(99, "Pravalika");
	ht.put(99, "SreeRam");
	//ht.put(null, "john");  null not possible
	//ht.compute(108, null);  not possible		NullPointerException
	
	System.out.println("Data : "+ht);
}
}
