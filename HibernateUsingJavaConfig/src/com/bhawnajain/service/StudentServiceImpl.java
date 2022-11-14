package com.bhawnajain.service;


import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bhawna.configuration.HibernateUtil;
import com.bhawnajain.model.Student;

public class StudentServiceImpl implements StudentServiceI {

	Scanner sc=new Scanner(System.in);
	@Override
	public void save() {
		
		System.out.println("How many student you want to enter : ");
		int a=sc.nextInt();
		for (int i = 1; i <= a; i++) {
		
			SessionFactory factory = HibernateUtil.getSessionFactory();
			
			Session session = factory.openSession();
			
			session.beginTransaction();
			Student s=new Student();
			System.out.println("Enter your name : ");
			String s1=sc.next();
			
			s.setSanem(s1);
			
			System.out.println("Enter your Address : ");
			String s2=sc.next();
			
			s.setAddress(s2);;
			
			
			session.save(s);
			session.getTransaction().commit();
		}
		
		
	}
	@Override
	public void show() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		
		String q="from * StudentDetails";
		
		Query query = session.createQuery(q);
		List<Student> l=query.getResultList();
		for (Student student : l) {
			System.out.println(student);
		}
		
		
	}
	@Override
	public void updateData() {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		System.out.println("Press 1 for get name");
		System.out.println("Press 2 for address");
		System.out.println("Press 3 for exit");
		
		int a=sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("Enter id you want to update : ");
			int id=sc.nextInt();
			Student student = session.get(Student.class, id);
			
			System.out.println(student.getSanem()+"    "+student.getAddress());
			System.out.println("Enter name : ");
			String name = sc.next();
			student.setSanem(name);
			session.beginTransaction();
			session.update(student);
			session.getTransaction().commit();	
					
			break;
		case 2: 
			System.out.println("Enter id you want to update : ");
			int id1=sc.nextInt();
			Student student1 = session.get(Student.class, id1);
			
			System.out.println(student1.getSanem()+"    "+student1.getAddress());
			System.out.println("Enter new Address : ");

			String add = sc.next();
			student1.setAddress(add);
			session.beginTransaction();
			session.update(student1);
			session.getTransaction().commit();	
			break;
		case 3: 
			
			break;	
		}
		
		
	}
	@Override
	public void deletebyId() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		String hql="delete from Student";
		Query query = session.createQuery(hql);
		session.beginTransaction();
		query.executeUpdate();
		session.getTransaction().commit();
		
		
	}

}
