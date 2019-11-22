package com.ustglobal.map;

import java.util.Map;
import java.util.TreeMap;

public class TetE {
public static void main(String[] args) {
	TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
	lh.put("Bangalore", 560068);
	lh.put("Hariyana", 134203);
	lh.put("Amaravathi", 560071);
	//lh.put(null,7878);	
	
	for(Map.Entry<String, Integer> m : lh.entrySet())
	{
				Integer value = m.getValue();
				String key = m.getKey();
				
				System.out.println("Key is "+key);
				System.out.println("Value is "+value);
				System.out.println("---------------");
	}
}
}
