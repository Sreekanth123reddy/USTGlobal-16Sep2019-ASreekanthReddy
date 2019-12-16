package com.ustglobal.lms.dao;

import com.ustglobal.lms.dto.Users;

public interface LogInDAO {
	public Users login(int id,String password);
	public Users register(Users bean);

}
