package com.ustglobal.studentdata.dao;

import java.util.List;

import com.ustglobal.studentdata.dto.StudentBean;


public interface StudentDAO {
public List<StudentBean> getAllStudentData();
public int[] insertStudentData();

}
