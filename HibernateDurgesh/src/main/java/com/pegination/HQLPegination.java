package com.pegination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.HibernateDurgesh.Student;



public class HQLPegination {
	
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		
		Query query=s.createQuery("from Student order by name");
		
		//Implementing pegination using hibernate
		query.setFirstResult(0);
		query.setMaxResults(2);
		
		List<Student> list=query.list();
		for(Student st:list)
		{
			System.out.println(st.getName()+" : "+st.getCerti());
		}
		
		s.close();
		factory.close();
	}

}
