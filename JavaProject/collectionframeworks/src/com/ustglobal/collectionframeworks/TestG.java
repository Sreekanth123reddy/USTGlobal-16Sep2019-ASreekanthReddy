package com.ustglobal.collectionframeworks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
public static void main(String[] args) {
	LinkedList li = new LinkedList();
	li.add(12);
	li.add(34.5);
	li.add("Pranitha Subassh");
	li.add(false);
	li.add(null);
	
	System.out.println("Using for loop");
	for(int i = 0;i<li.size();i++)
	{
		System.out.println(li.get(i));
	}
	System.out.println("Using for each loop");
	for(Object o : li)
	{
		System.out.println(o);
	}
	System.out.println("Using iterator");
	Iterator i =li.iterator();
	while(i.hasNext())
	{
		Object ot= i.next();
		System.out.println(ot);
	}
	System.out.println("Using List Iterator forward");
	ListIterator it = li.listIterator();
	while(it.hasNext())
	{
		Object o =it.next();
		System.out.println(o);
	}
System.out.println("Using list iterator backward");
	while(it.hasPrevious()) {
		Object o = it.previous();
		System.out.println(o);
	}
}
}
