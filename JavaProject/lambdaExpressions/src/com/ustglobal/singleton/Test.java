package com.ustglobal.singleton;

public class Test {
public static void main(String[] args) {
	//MySingleton ms = new MySingleton();	 not possible
	
	MySingleton ms  = MySingleton.getDbConnection();
	ms.s = "sree";
	System.out.println("HasCode of ms "+ms.hashCode());
	MySingleton mx = MySingleton.getDbConnection();
	mx.s ="hi";
	System.out.println("Hashcode of mx "+mx.hashCode());
	System.out.println(ms.s);
	System.out.println(mx.s);
	
}

}
