package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJ {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(24);
		pq.add(35);
		pq.add(45);
		pq.add(1);
		pq.offer(1);
		
		System.out.println("Before poll "+pq);
		System.out.println("************Using Iteratoe**********");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext())
		{
			Integer i =it.next();
			System.out.println(i);
		}
	}

}
