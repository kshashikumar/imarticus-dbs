package com.hiber2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hiber2.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
												.applySettings(configuration.getProperties())
												.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("nihu");
		
		Employee e2=new Employee();
		e1.setId(2);
		e1.setName("patel");
		
		session.save(e1);
		session.save(e2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
    }
}
