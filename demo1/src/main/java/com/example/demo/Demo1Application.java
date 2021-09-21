package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.beans.Employee;
import com.example.demo.service.DatabaseSaver;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext cnt=	SpringApplication.run(Demo1Application.class, args);
	Employee e1=new Employee();
	e1.setId(1);
	e1.setName("rahul");
	
	DatabaseSaver dbsaver=cnt.getBean(DatabaseSaver.class);
	dbsaver.save(e1);
	
	}

}
