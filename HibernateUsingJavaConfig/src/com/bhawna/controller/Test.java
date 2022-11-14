package com.bhawna.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bhawna.configuration.HibernateUtil;
import com.bhawna.model.Student;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		//Transient state
		Student s=new Student();
		s.setId(11);
		s.setName("Bhawna");
		
		
		//Persistent state
		session.beginTransaction();
		session.saveOrUpdate(s);
		session.getTransaction().commit();
		
		//Remove state
		Student s1=new Student();
		s1.setId(11);
		session.beginTransaction();
		session.delete(s1);
		session.getTransaction().commit();
		
		
		//Detached state
		session.close();
	}
}
