package com.ustglobal.sorting.list;

public class Laptap implements Comparable<Laptap> {
	double price;
	int ram;
	String name;

	public Laptap(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}

//		@Override
//		public int compareTo(Laptap o) {
//			if(this.ram > o.ram)
//			{
//				return 1;
//			}
//			else if(this.ram<o.ram)
//			{
//				return -1;
//			}
//			else
//			{
//				return 0;
//			}
//		}
		
	@Override
	public int compareTo(Laptap o) {
		Double i =this.price;
		Double j  = o.price;
		return i.compareTo(j);
	}

}
