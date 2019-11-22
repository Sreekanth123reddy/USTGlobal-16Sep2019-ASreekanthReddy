package com.ustglobal.atmmachine;

public class HDFC implements ATM
{

	@Override
	public void validateCard() {
		System.out.println("HDFC Validating Card");
	}

	@Override
	public void getInfo() {
		System.out.println("HDFC getting info");		
	}

}
