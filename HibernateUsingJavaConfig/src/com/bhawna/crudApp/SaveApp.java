package com.bhawna.crudApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bhawna.configuration.HibernateUtil;

public class SaveApp {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		
	}
}
