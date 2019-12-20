package com.ustglobal.lms.service;

import com.ustglobal.lms.dto.Users;

public interface LogInService {
	public Users login(int id,String password);
	public Users register(Users bean);
}
