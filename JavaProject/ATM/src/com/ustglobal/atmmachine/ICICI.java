package com.ustglobal.atmmachine;

public class ICICI implements ATM {

	@Override
	public void validateCard() {
		System.out.println("ICIC validating the card");		
	}

	@Override
	public void getInfo() {
		System.out.println("ICICI getting info");		
	}

}
