package com.ustglobal.lambdaExpressions;

public class TestMultipl {
public static void main(String[] args) {
	MultiplyInterface multi = (a,b)->a*b;
	int product = multi.multiplly(20, 30);
	System.out.println("Product is :"+product);
}
}
