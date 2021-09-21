package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.beans.Employee;
import com.practice.service.SaverService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext cnt=new ClassPathXmlApplicationContext("spring.xml");
      SaverService saver= (SaverService)cnt.getBean("saver");
      Employee e1=new Employee();
      e1.setId(1);
      e1.setName("John wick");
      saver.save(e1);
	}

}
