package com.ustglobal.java8features;

import java.util.function.Function;

public class TestC {
public static void main(String[] args) {
	Function<Integer,Integer> f = i -> i*i;
	int res = f.apply(5);
	System.out.println(res);
	
	System.out.println("Squre of 25 :"+f.apply(25));
}
}
