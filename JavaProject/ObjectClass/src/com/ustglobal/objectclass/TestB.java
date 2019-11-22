package com.ustglobal.objectclass;

public class TestB {
	public static void main(String[] args) {
		Pen p = new Pen();
		int hc = p.hashCode();
		System.out.println("HashCode of the object is "+hc);
		Pen q = new Pen();
		int qHc = q.hashCode();
		System.out.println("Hashcode of q "+qHc);
	}

}
