package com.shubham;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bhawna.configuration.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Student s=new Student();
		s.setSid(111);
		s.setSname("Shubham");
		
		Address a=new Address();
		a.setAreaname("Pimpri");
		a.setCityname("Pune");
		s.setAddress(a);
		
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();	}
}
