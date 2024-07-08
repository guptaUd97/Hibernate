package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.HibernateDurgesh.Student;

public class FirstLevel {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		Student student=session.get(Student.class, 1010);
		System.out.println(student);
		
		System.out.println("working something...");
		
		Student st1=session.get(Student.class, 1010);
		System.out.println(st1);
		
		System.out.println(session.contains(st1));
		
		
		session.close();
		factory.close();
	}

}
