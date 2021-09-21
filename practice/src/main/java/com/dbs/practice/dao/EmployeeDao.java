package com.dbs.practice.dao;

import com.dbs.practice.beans.Employee;

public class EmployeeDao {
	public boolean create(Employee employee) {
		System.out.println("Saved employee (DAO) "+employee);
		return true;
	}

}
