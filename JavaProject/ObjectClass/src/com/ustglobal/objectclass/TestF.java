package com.ustglobal.objectclass;

public class TestF {
	public static void main(String[] args) {
		Cow c1 =new Cow(1, "brown",45000);
		Cow c2 = new Cow(2,"red" ,10000);
		Cow c3 =new Cow(1, "brown",45000);
		Cow c4=c2;
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
		System.out.println(c2.equals(c3));
		System.out.println(c2.equals(c4));
	}

}
