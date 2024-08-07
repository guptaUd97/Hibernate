package com.hql;

import java.util.Arrays;
import java.util.List;



import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.HibernateDurgesh.Student;

public class HQLExample {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session s=factory.openSession();
		
		String query="from Student where city='bihar'and name='deepak'";  //city=:x
		Query q=s.createQuery(query);
		
		//q.setParameter("x","bihar");//if use alternate variable
		
		//single-(Unique)
		//multiple-list
		List<Student> list=q.list();
		
		
		for(Student student:list)
		{
			System.out.println(student.getName()+" : "+student.getCerti().getCourse());
		}
		
		
		
		Transaction tx=s.beginTransaction();
		
//		System.out.println("Delete query.........");
//		Query q2=s.createQuery("delete from Student s where s.city=:c");
//		q2.setParameter("c", "nagpur");
//		int r=q2.executeUpdate();
//		System.out.println("Deleted");
//		System.out.println(r);
//		tx.commit();
		
		System.out.println("Update query.........");
		Query q3=s.createQuery("update Student set course=:c where city=:ci");
		q3.setParameter("c","Java Spring");
		q3.setParameter("ci", "bihar");
		int r2=q3.executeUpdate();
		System.out.println(r2+"object updated");
		tx.commit();
		
		
		System.out.println("Join query.........");
		Query q4=s.createQuery("select q.question,q.questionId,a.answer from Question as q INNER JOIN q.answers as a");
		List<Object[]> list3=q4.getResultList();
		for(Object[]arr :list3) {
			System.out.println(Arrays.toString(arr));
		}
		
		s.close();
		factory.close();
	}

}
