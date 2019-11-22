package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByName1 implements Comparator<Customer1> {

	@Override
	public int compare(Customer1 o1, Customer1 o2) {
		String s1 = o1.name;
		String s2 = o2.name;
		return s1.compareTo(s2);
	}

}
