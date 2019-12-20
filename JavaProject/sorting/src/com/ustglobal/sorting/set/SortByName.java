package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByName implements Comparator<TreeSetEg1> {
@Override
public int compare(TreeSetEg1 o1, TreeSetEg1 o2) {
		String s1 =o1.bankname;
		String s2 =o2.bankname;
		return s1.compareTo(s2);
}

}
