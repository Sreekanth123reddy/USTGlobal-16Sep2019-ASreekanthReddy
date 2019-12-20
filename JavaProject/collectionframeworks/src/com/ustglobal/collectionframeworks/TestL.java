package com.ustglobal.collectionframeworks;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
public static void main(String[] args) {
	LinkedList<Integer> l = new LinkedList<Integer>();
	l.add(4227);
	l.add(4098);
	l.add(4125);
	l.add(4096);
	l.add(4099);
	
	System.out.println("Before sort  :"+l);
	Collections.sort(l);
	System.out.println("After sort  :"+l);
	
	Collections.reverse(l);
	System.out.println("After Reverse :"+l);

	Collections.shuffle(l);
	System.out.println("After Shuffle "+l);
}
}
