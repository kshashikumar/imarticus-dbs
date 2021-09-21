package com.practice.service;

import com.practice.beans.Employee;

public class DatabaseSaver  implements SaverService{
  
	@Override
	public void save(Employee e) {
		 System.out.println("db : "+e);
	}
}
