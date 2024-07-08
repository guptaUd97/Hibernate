
package com.nativeQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class NativeSqlExample {
	
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		//Sql Query
		String q="select * from student_detail";
		NativeQuery nq =session.createSQLQuery(q);
		
		List<Object[]> list=nq.list();
		for(Object[] st:list)
		{
			//System.out.println(Arrays.deepToString(st));
			System.out.println(st[1]+" : "+st[2]);
		}
		
		session.close();
		factory.close();
	}

}
