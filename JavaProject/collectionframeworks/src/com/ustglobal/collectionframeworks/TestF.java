package com.ustglobal.collectionframeworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Anupama");
		al.add("Raashi");
		al.add("Shradda das");
		al.add("Samantha");
		al.add("Thamanna");

		String love = al.get(0);
		System.out.println(love.toUpperCase());
		Iterator<String> li = al.iterator();
		while(li.hasNext())
		{
			String s = li.next();
			System.out.println(s);
		}
		System.out.println("================Using list iterator");

		ListIterator<String> l =al.listIterator();
		while(l.hasNext())
		{
			String s =l.next();
			System.out.println(s);
		}
		System.out.println("Using for each=================");
		for(String n : al)
		{
			System.out.println(n);
		}
	}
}
