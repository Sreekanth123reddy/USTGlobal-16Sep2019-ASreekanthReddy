package com.ustglobal.collectionframeworks;

import java.util.ArrayList;

public class TestE {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("Anupama Parameswaran");
	Object o = al.get(0);
	String name = (String) o;
	System.out.println(name.toUpperCase());
	System.out.println(o.toString().toUpperCase());
}
}
