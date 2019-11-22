package com.ustglobal.lambdaExpressions;

public class TestGreet {
public static void main(String[] args) {
	Greet g = (message)->{
					System.out.println("Hello , good morning");
					System.out.println(message);
					
	};
	g.greetings("Hey");
}
}
