package com.ustglobal.demo.util;

import com.usrglobal.demo.dto.A;
import com.ustglobal.springs.dao.I;

public class Manager {
	A a =null;
	
   public I getI() {
	if(a==null) {
	   return new A();
	}
	return a;
}
}
