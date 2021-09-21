package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.beans.Employee;

public interface EmployeeRepositry extends JpaRepository<Employee, Integer>{
    
	
}
