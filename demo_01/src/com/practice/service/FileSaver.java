package com.practice.service;

import com.practice.beans.Employee;

public class FileSaver implements SaverService{
  
	@Override
	public void save(Employee e) {
		 System.out.println("file : "+e);
	}
}
