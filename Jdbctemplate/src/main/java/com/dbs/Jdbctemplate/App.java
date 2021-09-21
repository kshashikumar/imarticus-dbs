package com.dbs.Jdbctemplate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dbs.Jdbctemplate.beans.Employee;
import com.dbs.Jdbctemplate.dao.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext cnt=new FileSystemXmlApplicationContext("spring.xml");
       
        JdbcTemplate jdbcTemplate = (JdbcTemplate)cnt.getBean("jdbcTemplate");
        EmployeeDao dao= (EmployeeDao)cnt.getBean("dao");
       
       dao.setJdbcTemplate(jdbcTemplate);
       List<Employee> employees =  dao.findAll();
		for(Employee employee : employees) {
			System.out.println(employee);
    }
}
}
