package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
public static void main(String[] args) {
	TreeSet ts = new TreeSet();
	ts.add(34);
	ts.add(58);
	ts.add(9);
	ts.add(15);
	//ts.add("Deepika"); classCastException
	//ts.add(null) ;  NullPointerException
	
	System.out.println("******************Using For each******************************");
	for(Object s : ts)
	{
		System.out.println(s);
	}
	
	System.out.println("*****************Using iterator*********************");
	Iterator it = ts.iterator();
	while(it.hasNext())
	{
		Object s = it.next();
		System.out.println(s);
	}
	

	
}
}
