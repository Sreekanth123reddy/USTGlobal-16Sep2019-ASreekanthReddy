package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
public static void main(String[] args) {
	LinkedList<Laptap> ll = new LinkedList<Laptap>();
	Laptap lp1 = new Laptap(25000, 4, "HP");
	Laptap lp2 = new Laptap(10000, 6, "Dell");
	Laptap lp3 = new Laptap(100000, 12, "Mac");
	Laptap lp4 = new Laptap(500000, 8, "Asus");
	ll.add(lp1);
	ll.add(lp2);
	ll.add(lp3);
	ll.add(lp4);
	ll.add(new Laptap(20000, 2, "acer"));
	
	displayLaptopDetails(ll);
	Collections.sort(ll);
	System.out.println("After Sorting");
	displayLaptopDetails(ll);
}


static void displayLaptopDetails(LinkedList<Laptap> l) {
	Iterator<Laptap> it = l.iterator();
	
	while(it.hasNext())
	{
		Laptap la = it.next();
		System.out.println(la.name);
		System.out.println(la.price);
		System.out.println(la.ram);
	}
}
}
