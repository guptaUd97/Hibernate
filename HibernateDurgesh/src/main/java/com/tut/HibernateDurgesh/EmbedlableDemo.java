package com.tut.HibernateDurgesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class EmbedlableDemo {

	public static void main(String[] args) {
		
			Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory= cfg.buildSessionFactory();
	        
	        Student student1=new Student();
	        
	        student1.setId(1020);
	        student1.setName("Julie");
	        student1.setCity("Nagpur");
	        
	        Certificate certi=new Certificate();
	        
	        certi.setCourse("Java");
	        certi.setDuration("2 Month");
	        
	        student1.setCerti(certi);
	        
	        Student student2=new Student();
	        
	        student2.setId(1030);
	        student2.setName("Divayanshi");
	        student2.setCity("Bihar");
	        
	        Certificate certi1=new Certificate();
	        
	        certi1.setCourse("Hibernate");
	        certi1.setDuration("2 Month");
	        
	        student1.setCerti(certi);
	        student2.setCerti(certi1);
	        
	        Session s=factory.openSession();
	        Transaction tx=s.beginTransaction();
	        
	        //object save
	        s.save(student1);
	        s.save(student2);
	        
	        
	        
	        tx.commit();
	        s.close();
	        factory.close();
	        
	}

}
