package com.bhawna.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

	public static void main(String[] args) {
	
		StandardServiceRegistry builder = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources m=new MetadataSources(builder);
		Metadata build = m.getMetadataBuilder().build();
		SessionFactory f=build.getSessionFactoryBuilder().build();
		
		Session s=f.openSession();
		Student s1=new Student();
		s1.setRolleno(3);
		s1.setName("Hemvanta");
		s1.setAddress("mumbai");
		
		Student s2=new Student();
		s2.setRolleno(4);
		s2.setName("Lata");
		s2.setAddress("Bhopal");
		
		Student s3=new Student();
		s3.setRolleno(5);
		s3.setName("Mamta");
		s3.setAddress("Patna");
		
		s.save(s1);
		//s.save(s2);
		s.persist(s2);
		s.saveOrUpdate(s3);
		s.beginTransaction().commit();;
		
		f.close();
		s.close();
	}

}
