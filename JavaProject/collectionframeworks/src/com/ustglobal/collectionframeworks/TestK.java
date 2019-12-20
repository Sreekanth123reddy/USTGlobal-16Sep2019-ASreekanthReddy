package com.ustglobal.collectionframeworks;

import java.util.ArrayList;
import java.util.List;

public class TestK {
public static void main(String[] args) {
	ArrayList<Double> al  = new ArrayList<Double>();
	al.add(34.5);
	al.add(56.6);
	al.add(89.6);
	al.add(89.45);
	al.add(12.3);
	al.add(34.5);
	al.add(null);
	al.add(null);
	
	
	System.out.println(al);
	
	al.add(2 , 98.0);
	System.out.println("After adding 2nd index"+al);
	al.remove(0);
	System.out.println("After removing  0 th index"+al);
	al.remove(null);
	System.out.println("After removing null"+al);
	Double val = al.get(4);
	System.out.println("Object at 4th index is :"+val);
	al.set(3, 88.4);
	System.out.println("After replacing 3rd index "+al);
	al.clear();
	System.out.println("after clear method "+al);
	System.out.println(al.contains(12.3));
	
	List<Double> al1 = new ArrayList<Double>();
	al1.add(12.9);
	al1.add(23.4);
	al1.add(34.5);
	al.addAll(al1);
	System.out.println("After add all "+al);
	
	boolean contain = al.containsAll(al1);
	System.out.println("Contains all of al1 "+contain);
	
	boolean res= al.removeAll(al1);
	System.out.println("Removed all of al1 "+res);
	
	System.out.println("After remove "+al);
	System.out.println(al1);
}
}
