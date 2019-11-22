package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
public static void main(String[] args) {
	ArrayList<Marker> al = new ArrayList<Marker>();
	al.add(new Marker(50, "black"));
	al.add(new Marker(45,"Blue"));
	al.add(new Marker(80, "red"));
	al.add(new Marker(70,"pink"));
	
	System.out.println("Before Sorting");
	display(al);
	SortByPrice sb = new SortByPrice();
	Collections.sort(al, sb);
	System.out.println("After Sortig");
	display(al);
	
//	SortByColor sc = new SortByColor();
//	Collections.sort(al, sc);
//	display(al);
}
public static void display(ArrayList<Marker> al)
{
	Iterator<Marker> it = al.iterator();
	while(it.hasNext())
	{
		Marker m = it.next();
		System.out.println("Price is :"+m.price);
		System.out.println("Color is :"+m.color);
		System.out.println("====================");
		
	}
}
}
