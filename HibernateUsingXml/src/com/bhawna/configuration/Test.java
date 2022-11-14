package com.bhawna.configuration;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.bhawnajain.model.OldStudent;
import com.bhawnajain.model.Student;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
//		OldStudent o=new OldStudent();
//		o.setName("bhawna");
//		o.setEmail("bhawna@gmail.com");
//		session.beginTransaction();
//		session.save(o);
//		session.getTransaction().commit();
		
		//String sql="insert into Student(id, name, email)" + "select id, name, email from OldStudent";
//		String sql="insert into Student(id, name, email) select id, name, email from OldStudent";
//
//		session.beginTransaction();
//		Query query = session.createQuery(sql);
//		query.executeUpdate();
//		session.getTransaction().commit();
		
//		session.beginTransaction();
//		String hql="update Student set name='Jain' where id=1";
//		Query q=session.createQuery(hql);
//		q.executeUpdate();
//		session.getTransaction().commit();
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter name you want to update");
//		String name=sc.next();
//		System.out.println("Enter id where you want to update record : ");
//		int id=sc.nextInt();
//		session.beginTransaction();
//		String hql="update Student set name=: name where id=:id";
//		Query query = session.createQuery(hql);
//		query.setParameter("name", name);
//		query.setParameter("id", id);
//		query.executeUpdate();
//		session.getTransaction().commit();
		
//		String hql="from Student";
//		Query query = session.createQuery(hql);
//		List<Student> list = query.getResultList();
//		for (Student student : list) {
//			System.out.println(student);
//		}
//		String hql="from Student where id=1";
//		Query query = session.createQuery(hql);
//		Student result = (Student) query.getSingleResult();
//		System.out.println(result);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter id : ");
//		int id=sc.nextInt();
//		
//		
//		String hql="from Student where id=:id";
//		Query query = session.createQuery(hql);
//		query.setParameter("id", id);
//		Student result = (Student) query.uniqueResult();
//		System.out.println(result);
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter id : ");
//		int id=sc.nextInt();
//		session.beginTransaction();
//		String hql="delete from Student where id=:id";
//		Query query = session.createQuery(hql);
//		query.setParameter("id", id);
//		query.executeUpdate();
//		session.getTransaction().commit();
		
		session.beginTransaction();
		String hql="delete from Student";
		Query query = session.createQuery(hql);
		query.executeUpdate();
		session.getTransaction().commit();
		
	}
}
