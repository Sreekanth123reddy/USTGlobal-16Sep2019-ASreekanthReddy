package com.ustglobal.lambdaExpressions;

public class TestSquare {
public static void main(String[] args) {
	SquareInterface si = (a)->a*a;
	System.out.println(si.square(10));
	
}
}
