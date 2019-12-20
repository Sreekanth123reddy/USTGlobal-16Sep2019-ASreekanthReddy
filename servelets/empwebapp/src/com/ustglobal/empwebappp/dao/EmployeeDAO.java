package com.ustglobal.empwebappp.dao;

import com.ustglobal.empwebapp.dto.EmployeeInfo;

public interface EmployeeDAO {
public EmployeeInfo auth(int id,String password);
public EmployeeInfo searchEmployee(int id);
public boolean changPassword(int id,String password);
public boolean registerEmployee(EmployeeInfo info);
}
