package com.ustglobal.collectionframeworks;

public class TestY extends TestZ{
private void m()
{
	System.out.println("sub class method()");
}
public static void main(String[] args) {
	TestY ty = new TestY();
	ty.m();

}
}
