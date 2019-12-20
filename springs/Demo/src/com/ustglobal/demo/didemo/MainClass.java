package com.ustglobal.demo.didemo;

import com.ustglobal.demo.util.Manager;
import com.ustglobal.springs.dao.I;

public class MainClass {
public static void main(String[] args) {
	Manager m = new Manager();
	I i = m.getI();
	i.m1();
	i.m2();
	i.m3();
}
}
