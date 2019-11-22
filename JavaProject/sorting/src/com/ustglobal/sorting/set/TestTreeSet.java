package com.ustglobal.sorting.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<TreeSetEg> hs = new TreeSet<TreeSetEg>();
	hs.add(new TreeSetEg(4098, "A Sreekanth Reddy", 100000));
	hs.add(new TreeSetEg(4098, "A Sreekanth Reddy", 100000));
	hs.add(new TreeSetEg(4099, " Reddy", 100000));
	hs.add(new TreeSetEg(4093, " Reddy", 100000));

	System.out.println("*****************Using iterator*********************");
	
	Iterator<TreeSetEg> it = hs.iterator();
	while(it.hasNext())
	{
		TreeSetEg s = it.next();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.salary);
	}

}}
