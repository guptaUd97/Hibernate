//package com.tut.HibernateDurgesh;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class StateDemo {
//	
//	public static void main(String[] args) {
//		
//		System.out.println("Exaple...");
//		
//		Configuration cfg=new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory factory= cfg.buildSessionFactory();
//        
//        Student student=new Student();
//        student.setId(9091);
//        student.setName("Deepak");
//        student.setCity("SahebGanj");
//        student.setCerti(new Certificate("java Hibernate", "2 months"));
//        //student:Transient
//        
//        Session s=factory.openSession();
//        Transaction tx=s.beginTransaction();
//        s.save(student);
//        //student: Persistent -session,database
//        
//        student.setName("Deepak Kumar");
//        tx.commit();
//        
//        
//        
//        factory.close();
//	}
//
//}
