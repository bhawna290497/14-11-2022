package com.shubham;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bhawna.configuration.HibernateUtil;

public class Test1 {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Question q=new Question();
		q.setQid(1);
		q.setQuestion("What is your name : ");
		
		Answer a=new Answer();
		a.setAid(1);
		a.setAnswer("Shubham");
		a.setQuestion(q);
		q.setAnswer(a);
		
		Question q1=new Question();
		q1.setQid(2);
		q1.setQuestion("Where are you from : ");
		
		Answer a1=new Answer();
		a1.setAid(2);
		a1.setAnswer("Pune");
		a1.setQuestion(q1);
		q1.setAnswer(a1);
		
		session.beginTransaction();
		session.save(q);
		session.save(q1);
		session.getTransaction().commit();
		
		
	}
}
