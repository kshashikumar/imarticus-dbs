package com.dbs.practice1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dbs.practice1.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctxt = new FileSystemXmlApplicationContext("spring.xml");
		Employee employee = ctxt.getBean(Employee.class);
		
		employee.setId(101);
		employee.setName("Kishor Kumar");
		
		System.out.println("id : "+employee.getId());
		System.out.println("name : "+employee.getName());

    }
}
