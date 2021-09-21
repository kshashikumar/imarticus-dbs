package com.example.demo.service;

import java.util.List;

import com.example.demo.beans.Employee;

public interface EmpServiceInterface {

	Employee addEmployee(Employee employee);

	Employee findById(int id);

	List<Employee> findAll();


	
	Employee deleteEmployee(int id);

	Employee updateEmployee(int id, Employee employee);
	


}