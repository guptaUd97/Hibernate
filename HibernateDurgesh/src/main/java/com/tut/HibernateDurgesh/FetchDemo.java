package com.tut.HibernateDurgesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	
	public static void main(String[] args) {
		
		//get,load
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		//get-student:
		//Student student=(Student)session.get(Student.class,102);
		Student student2=session.load(Student.class,102);
		//System.out.println(student);
		System.out.println(student2);
		
		Address ad=(Address)session.get(Address.class,2);
		System.out.println(ad.getStreet()+" "+ad.getCity());
		
		session.close();
		factory.close();
		
		
	}

}
