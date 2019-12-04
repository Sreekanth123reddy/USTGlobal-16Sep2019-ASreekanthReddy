package com.ustglobal.springboot.dto;

import java.util.List;

public class EmployeeResponse {
	private int statusCode;
	private List<EmployeeBean> empployeeBeans;
	private String message;
	private String description;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<EmployeeBean> getEmpployeeBeans() {
		return empployeeBeans;
	}
	public void setEmpployeeBeans(List<EmployeeBean> empployeeBeans) {
		this.empployeeBeans = empployeeBeans;
	}
}
