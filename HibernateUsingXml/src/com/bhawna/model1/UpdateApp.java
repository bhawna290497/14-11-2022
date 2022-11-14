package com.bhawna.model1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateApp {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		Session s=factory.openSession();
		Employee employee = s.get(Employee.class, 101);
		Employee e=new Employee();
		e.setEmpid(101);
		e.setEmpName("Krunali");
		e.setEmpSalary(34310);
		
		s.beginTransaction();
		s.merge(e);
		s.getTransaction().commit();
//		employee.setEmpName("Bhawna");
//		  
//		s.beginTransaction();
//		s.update(employee);
//		s.getTransaction().commit();
		
	}
}
