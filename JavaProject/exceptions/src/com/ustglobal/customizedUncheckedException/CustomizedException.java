package com.ustglobal.customizedUncheckedException;

public class CustomizedException extends RuntimeException{
	String message = "Invalid age below 18 years not allowed ";
	public  CustomizedException(String string) {
		
	}
	public void CustomizedException(String message){
	this.message = message;
		
	}
	@Override
	public String getMessage() {
		return message;
	}

}
