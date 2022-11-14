package com.bhawna.model1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveApp {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Employee emp=new Employee();
		emp.setEmpid(103);
		emp.setEmpName("Shubham");
		emp.setEmpSalary(42000);
		
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		
		Session session2 = factory.openSession();
		
		Employee emp1=new Employee();
		emp1.setEmpid(104);
		emp1.setEmpName("Neha");
		emp1.setEmpSalary(37000);
		
		session2.beginTransaction();
		session2.persist(emp1);
		session2.getTransaction().commit();
		
		Session session3 = factory.openSession();
		
		Employee emp2=new Employee();
		emp2.setEmpid(101);
		emp2.setEmpName("Bhawna");
		emp2.setEmpSalary(45000);
		
		session3.beginTransaction();
		session3.saveOrUpdate(emp2);
		session3.getTransaction().commit();
		
		
		
	}
}
