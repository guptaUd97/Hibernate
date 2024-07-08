package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tut.HibernateDurgesh.Student;

public class CriteriaExample {
public static void main(String[] args) {
	
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	
	Criteria c=session.createCriteria(Student.class);
	//c.add(Restrictions.eq("certi.course", "java"));
	c.add(Restrictions.gt("id", 1020));
	
	List<Student> list=c.list();
	
	for(Student st:list)
	{
		System.out.println(st);
	}
	
	session.close();
}
}
