package com.ustglobal.studentdata.util;

import com.ustglobal.studentdata.dao.StudentDAO;
import com.ustglobal.studentdata.dao.StudentDAOImpl;

public class StudentFactory {
	private StudentFactory()
	{
		
	}
	public static StudentDAO getStudentDAO()
	{
		return new StudentDAOImpl();
	}

}
