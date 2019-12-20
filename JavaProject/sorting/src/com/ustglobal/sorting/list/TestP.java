package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestP {
public static void main(String[] args) {
	ArrayList< Pen> al = new ArrayList<Pen>();
	Pen p1 = new Pen(5.6, "cello");
	Pen p2 = new Pen(4.5 ,"Ronaldo");
	Pen p3= new  Pen(9.6, "ShiftR");
	
	al.add(p1);
	al.add(p2);
	al.add(p3);
	al.add(new Pen(3.6, "ClickZoom"));
	displayPenDetails(al);
	System.out.println("After Sorting ------>");
	Collections.sort(al);
	displayPenDetails(al);
}
public static void displayPenDetails(ArrayList<Pen> al)
{
	Iterator<Pen> it =al.iterator();
	while(it.hasNext())
	{
		Pen p = it.next();
		System.out.println(p.price);
		System.out.println(p.brand);
	}
	
}
}
