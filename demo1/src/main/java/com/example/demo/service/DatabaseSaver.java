package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.beans.Employee;

@Component
public class DatabaseSaver {
    
	public void save(Employee emp) {
		System.out.println("employee: "+emp);
	}
}
