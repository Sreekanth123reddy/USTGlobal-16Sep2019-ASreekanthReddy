package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
public static void main(String[] args) {
	SortByName sb = new SortByName();
	TreeSet<TreeSetEg1> ts = new TreeSet<TreeSetEg1>(sb);
	TreeSetEg1 b1 = new TreeSetEg1("HDFC", 4098, 400000);
	TreeSetEg1 b2 = new TreeSetEg1("FC", 4099, 443000);
	TreeSetEg1 b3 = new TreeSetEg1("Indian", 4100, 4000);
	TreeSetEg1 b4 = new TreeSetEg1("UCO", 4089, 56856);
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	
	System.out.println("********Using iterator*************");
	
	Iterator<TreeSetEg1> it =ts.iterator();
	while(it.hasNext())
	{
		TreeSetEg1 t1 =it.next();
		System.out.println("Name is "+t1.bankname);
		System.out.println("Pincode is :"+t1.code);
		System.out.println("Micr :"+t1.balance);
		System.out.println("===========");
	}
	
}
}
