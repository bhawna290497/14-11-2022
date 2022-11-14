package com.bhawna.model1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetriveApp {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session openSession = factory.openSession();
//		Employee e=openSession.get(Employee.class, 101);
//		System.out.println(e);
		
		Employee e=openSession.load(Employee.class, 103);
		System.out.println(e);
	}
}
