package com.ustglobal.customizedUncheckedException;

public class Validator {
	void Verify(int age) {
		if(age < 18)
		{
			throw new CustomizedException("try again next time");
		}

	}
}
