package com.bhawna.model1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteApp {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Employee e=new Employee();
		e.setEmpid(102);
		session.beginTransaction();
		session.delete(e);
		session.getTransaction().commit();;
	}
}
