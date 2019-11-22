package com.ustglobal.objectclass;

public class TestE {
	public static void main(String[] args) {
		Car c = new Car(450000, "BMW", "red");
		System.out.println("Hash code  overridden "+c.hashCode());
		System.out.println(c);
	}
	

}
