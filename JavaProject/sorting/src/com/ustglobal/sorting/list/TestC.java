package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
public static void main(String[] args) {
	
	LinkedList<Integer> ll = new LinkedList<Integer>();
	ll.add(12);
	ll.add(45);
	ll.add(89);
	ll.add(87);
	
	Integer peekElement  = ll.peek();
	System.out.println("Peek Element "+peekElement);
	Integer peekFirstElement  = ll.peekFirst();
	System.out.println("Peek First Element "+peekFirstElement);
	Integer peekLastElement = ll.peekLast();
	System.out.println("Peek last element :"+peekLastElement);
	System.out.println("After peek------->"+ll);
	
	Integer pollElement  = ll.poll();
	System.out.println("poll element"+pollElement);
	Integer pollFirstElement  = ll.pollFirst();
	System.out.println("poll first Element"+pollFirstElement);
	Integer pollLastElement  = ll.pollLast();
	System.out.println("poll last element "+pollLastElement);
	System.out.println("After poll "+ll);
	
	ll.push(58);
	ll.push(56);
	System.out.println(ll);
	ll.pop();
	System.out.println(ll);
	
}
}
