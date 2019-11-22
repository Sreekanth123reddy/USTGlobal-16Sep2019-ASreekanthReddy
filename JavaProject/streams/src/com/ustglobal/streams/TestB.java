package com.ustglobal.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(23);
	al.add(20);
	al.add(18);
	al.add(78);
	al.add(12);
	al.add(7);
	al.add(1);
	al.add(30);
	
	List<Integer> li = al.stream().map(i -> i*3 ).collect(Collectors.toList());
	
	for(Integer i : li)
	{
		System.out.println(i);
	}
}
}
