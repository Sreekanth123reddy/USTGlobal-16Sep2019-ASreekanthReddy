package com.ustglobal.reference;

public class Test {
public static void main(String[] args) {
	Pen p = new Marker();	//Up casting
	System.out.println(p.cost);
	p.write();
//	System.out.println(p.size);
//	p.color();
	Marker m = (Marker)p ;  //Down casting
	System.out.println(m.size);
	m.color();
}
}
