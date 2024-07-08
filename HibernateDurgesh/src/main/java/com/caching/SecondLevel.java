package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
import org.hibernate.cfg.Configuration;

import com.tut.HibernateDurgesh.Student;


import net.sf.ehcache.hibernate.EhCacheRegionFactory;

public class SecondLevel {
	
	public static void main(String[] args) {
		

		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		//first
		Student st1=session.get(Student.class, 1020);
		System.out.println(st1);
		
		session.close();

		Session session2=factory.openSession();
		//second
		Student st2=session2.get(Student.class, 1020);
		System.out.println(st2);
		
		session.close();
		}

}
