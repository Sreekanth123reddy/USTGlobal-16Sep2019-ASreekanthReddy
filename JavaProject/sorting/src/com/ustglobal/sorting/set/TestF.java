package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
public static void main(String[] args) {
	TreeSet<String> ts = new TreeSet<String>();
	ts.add("Roopa");
	ts.add("Jaya");
	ts.add("Sreya");
	ts.add("kavya");
	ts.add("Bakkamma");
	ts.add("Poyirayi");
	
	System.out.println("******************Using For each******************************");
	for(String s : ts)
	{
		System.out.println(s);
	}
	
	System.out.println("*****************Using iterator*********************");
	Iterator<String> it =ts.iterator();
	while(it.hasNext())
	{
		String s = it.next();
		System.out.println(s);
	}

}
}
