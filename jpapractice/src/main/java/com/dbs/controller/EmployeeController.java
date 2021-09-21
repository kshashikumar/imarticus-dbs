package com.dbs.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dbs.beans.Employee;
import com.dbs.dao.EmployeeRepositry;

@Controller
public class EmployeeController {
  
	@Autowired
	EmployeeRepositry employeeRepositry;
	
	public Employee insert(Employee employee) {
	 return	employeeRepositry.save(employee);
	}
	
	public Employee find(Integer id) {
		Optional<Employee> e1 = employeeRepositry.findById(id);
		return e1.get();
	}
	
	public Employee update(Employee employee) {
		 return	employeeRepositry.save(employee);
		}
	
	public Employee delete(Employee employee) {
		Employee e1=employeeRepositry.findById(employee.getId()).get();
		employeeRepositry.delete(employee);
		return e1;
	}
}
