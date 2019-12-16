package com.ustglobal.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.LogInDAO;
import com.ustglobal.lms.dto.Users;
@Service
public class LogInServiceImpl implements LogInService{

	@Autowired
	private LogInDAO dao;
	@Override
	public Users login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public Users register(Users bean) {
		return dao.register(bean);
	}

}
