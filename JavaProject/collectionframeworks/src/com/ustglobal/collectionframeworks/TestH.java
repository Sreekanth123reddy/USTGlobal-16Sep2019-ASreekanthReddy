package com.ustglobal.collectionframeworks;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {
public static void main(String[] args) {
	Vector li = new Vector();
	li.add(12);
	li.add(34.5);
	li.add("Pranitha Subassh");
	li.add(false);
	li.add(null);
	
	System.err.println("Using for loop");
	for(int i = 0;i<li.size();i++)
	{
		System.out.println(li.get(i));
	}
	System.err.println("Using for each loop");
	for(Object o : li)
	{
		System.out.println(o);
	}
	System.err.println("Using iterator");
	Iterator i =li.iterator();
	while(i.hasNext())
	{
		Object ot= i.next();
		System.out.println(ot);
	}
	System.err.println("Using List Iterator forward");
	ListIterator it = li.listIterator();
	while(it.hasNext())
	{
		Object o =it.next();
		System.out.println(o);
	}
System.err.println("Using list iterator backward");
	while(it.hasPrevious()) {
		Object o = it.previous();
		System.out.println(o);
	}
}
}
