package com.ustglobal.arrays;

public class ArrayEg 
{
	public static void main(String[] args) {
		int [] num = new int[5];
		num[0] = 1;
		num[1] = 15;
		num[2] = 1;
		num[3] = 13;
		num[4] = 111;
		System.out.println("===================");
		for(int n:num)
		{
			System.out.println(n);
		}
		System.out.println("===================");
		char[] ch = {'a','b','c','d'};
		for(char c : ch)
		{
			System.out.println(c);
		}
		System.out.println("=========================");
//		boolean b[] = {true,false,true,true,false};
//		for(boolean i :b)
//		{
//			System.out.println(i);
//		}
		
	
	
	}
}
