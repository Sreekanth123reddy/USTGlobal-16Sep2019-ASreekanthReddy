package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class Palindrome {
public static void main(String[] args) {
	Predicate<Integer> p =(i)->
	{
		int a = i;
		int res=0;
		while(i>0)
		{
			int rem = i%10;
			res = res*10+rem;
			i=i/10;
		}
		if(a==res)
			return true;
		else 
			return false;
		
	};
boolean res = p.test(151);
System.out.println(res);
}

}
