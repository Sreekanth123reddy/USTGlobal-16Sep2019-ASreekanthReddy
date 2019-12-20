package com.ustglobal.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(70);
	al.add(69);
	al.add(58);
	al.add(95);
	al.add(87);
	al.add(24);
	al.add(32);
	
	List<Integer> l =al.stream().sorted().collect(Collectors.toList());
	
	Iterator<Integer> it = l.iterator();
	while(it.hasNext())
	{
		Integer i = it.next();
		System.out.println("Sorted-------->");
		System.out.println(i);
	}
	
}
}
