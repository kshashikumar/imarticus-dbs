package com.dbs.practice.service;

import com.dbs.practice.beans.Employee;
import com.dbs.practice.dao.EmployeeDao;

public class EmployeeService {
	EmployeeDao employeeDao;

	public EmployeeService(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
		System.out.println("Parameter Consutor of EmployeeService");
	}
	

//	public EmployeeService() {
//		employeeDao = new EmployeeDao();
//	}

	public EmployeeService() {
		super();
		System.out.println("No-param construcotr of EmployeeService");
		
	}


	public boolean save(Employee emp) {
		if (employeeDao.create(emp)) {
			System.out.println("Employee saved successfully (Service) ");
			return true;
		} else {
			return false;
		}
	}
}
