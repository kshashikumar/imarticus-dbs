package com.dbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dbs.beans.Employee;
import com.dbs.controller.EmployeeController;

@SpringBootApplication
public class JpapracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(JpapracticeApplication.class, args);
	   EmployeeController empcontroller=ctxt.getBean(EmployeeController.class);
	   
	   Employee e1= new Employee();
	   e1.setName("raj");
	   
	  Employee emp= empcontroller.insert(e1);
	  System.out.println(emp);
	}

}
