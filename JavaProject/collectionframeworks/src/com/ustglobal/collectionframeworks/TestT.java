package com.ustglobal.collectionframeworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestT {
public static void main(String[] args) {
	ArrayList<Teacher> al = new ArrayList<Teacher>();
	Teacher t1 = new Teacher(4098, "Surekha", "cse", 96336l);
	Teacher t2 = new Teacher(4099, "Swathi", "ece", 250000L);
	Teacher t3 = new Teacher(4100, "SubhaLekha", "cse", 90000L);
	Teacher t4 = new Teacher(4101, "Swapna", "civil", 4000000L);
	al.add(t1);
	al.add(t2);
	al.add(t3);
	al.add(t4);
	System.out.println("Iterate using for - each loop");
	for(Teacher t : al)
	{
		System.out.println(t);
	}
	System.out.println("Iterate using iterator");
	Iterator<Teacher> it = al.iterator();
	while(it.hasNext())
	{
		Object ot= it.next();
		System.out.println(ot);
	}
	
}
}
