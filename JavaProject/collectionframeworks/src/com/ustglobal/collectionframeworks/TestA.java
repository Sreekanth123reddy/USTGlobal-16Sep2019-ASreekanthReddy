package com.ustglobal.collectionframeworks;

import java.util.ArrayList;

public class TestA {
public static  void main(String[] args) {
	ArrayList al  = new ArrayList();
	al.add(12);
	al.add("sreekanth reddy");
	al.add(22.5);
	al.add(null);
	al.add(true);
	al.add('A');
	al.add(2222222222L);
	
	Object o = al.get(1);
	System.out.println("second element is :"+o);
	for(int i = 0;i<6 ;i++) {
		Object obj = al.get(i);
		System.out.println(obj);
	}
}
}
