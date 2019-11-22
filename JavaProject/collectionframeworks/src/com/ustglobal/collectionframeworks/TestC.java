package com.ustglobal.collectionframeworks;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
public static void main(String[] args) {
	ArrayList al  =new ArrayList();
	al.add(23);
	al.add(98.6);
	al.add(true);
	al.add("GoodMorning");
	
	Iterator it = al.iterator();
	Object o1 = it.next();
	System.out.println(o1);
	Object o2 = it.next();
	System.out.println(o2);
	Object o3 = it.next();
	System.out.println(o3);
	Object o4 = it.next();
	System.out.println(o4);
	boolean b = it.hasNext();
	System.out.println("Has Next "+b);
//	Object o5 = it.next();
//	System.out.println(o5);   NoSuchElementException
	
	for(int i=0;i<al.size();i++)
	{
		Object o =al.get(i);
		System.out.println(o);
	}
	
	ArrayList all = new ArrayList();
	all.add(123);
	all.add("Sree");
	all.add(false);
	all.add(null);
	all.add(23.56f);
	
	System.out.println("Using Iterator");
	Iterator it1 = all.iterator();
	while(it1.hasNext())
	{
		Object o = it1.next();
		System.out.println(o);
	}
	
}
}
