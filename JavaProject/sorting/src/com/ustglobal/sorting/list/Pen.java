package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen> {
	double price;
	String brand;
	
	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	@Override
	public int compareTo(Pen o) {
		Double p1= this.price;
		Double p2 = o.price;
		return p1.compareTo(p2);
	}
	

}
