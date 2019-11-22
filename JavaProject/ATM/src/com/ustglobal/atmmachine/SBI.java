package com.ustglobal.atmmachine;

public class SBI implements ATM {

	@Override
	public void validateCard() {
System.out.println("SBI is validating the card");		
	}

	@Override
	public void getInfo() {
System.out.println("SBI is getting info");		
	}

}
