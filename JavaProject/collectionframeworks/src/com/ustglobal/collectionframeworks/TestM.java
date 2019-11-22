package com.ustglobal.collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("Bhavya");
	al.add("Swapna");
	al.add("Anjali");
	al.add("Vanaja Gayathri");
	al.add("Lakshmi Priya");
	al.add("Soumya");
	
	System.out.println("Befor Sort ---->" + al);
	Collections.sort(al);
	System.out.println("After sort---->"+al);
}
}
