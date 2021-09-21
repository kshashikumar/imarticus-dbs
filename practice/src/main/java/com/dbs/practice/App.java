package com.dbs.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dbs.practice.beans.Employee;
import com.dbs.practice.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
		ApplicationContext ctxt = new FileSystemXmlApplicationContext("spring.xml");
		EmployeeService service = (EmployeeService)ctxt.getBean("empService");
		
		service.save(new Employee(101, "Kishor"));
    }
}
