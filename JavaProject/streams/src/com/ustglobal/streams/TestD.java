package com.ustglobal.streams;

import java.util.ArrayList;
import java.util.Comparator;

public class TestD {
public static void main(String[] args) {
	ArrayList<Integer> marks = new ArrayList<Integer>();
	marks.add(70);
	marks.add(69);
	marks.add(58);
	marks.add(95);
	marks.add(87);
	marks.add(24);
	marks.add(32);
	
	Comparator<Integer> com = (number1,number2) ->
	{
		if(number1>number2)
		{
			return 1;
		}
		else if(number1<number2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	};
	
	long noOfFailedStudents = marks.stream().filter(i -> i<40).count();
	System.out.println(noOfFailedStudents);
	System.out.println("=================");
	Integer i =	marks.stream().min(com).get();
	System.out.println("Min value"+i);
	System.out.println("=========================");
	Integer j = marks.stream().max(com).get();
	System.out.println("Max value"+j);

	
	
}
}
