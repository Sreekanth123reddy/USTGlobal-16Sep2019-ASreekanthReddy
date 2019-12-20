package com.ustglobal.hasarelation.weak;

public class TestB {
	public static void main(String[] args) {
		Music m  =new Music();
		m.song = "Nijanga cheppalantae kshmanichu";
		System.out.println(m.song);
		m.playSong();
		System.out.println("====================");
		m.c.price = 450000;
		System.out.println("price of car"+m.c.price);
		System.out.println("collor "+m.c.color);
		m.c.speed();
	}

}
