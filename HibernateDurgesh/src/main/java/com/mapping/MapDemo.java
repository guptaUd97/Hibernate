package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        
//        //OneToOne Data
        Question q1=new Question();
        q1.setQuestionId(101);
        q1.setQuestion("what is java");
        
        Answer a1=new Answer();
        a1.setAnswerId(1001);
        a1.setAnswer("Java is a programing language");
        q1.setAnswer(a1);
        a1.setQuestion(q1);
        
        //OneToOne
        Question q2=new Question();
        q2.setQuestionId(102);
        q2.setQuestion("Collection");
 
        Answer a2=new Answer();
        a2.setAnswerId(1002);
        a2.setAnswer("Api to work with object in java");
        q2.setAnswer(a2);
        a2.setQuestion(q2);
        
        
        //OneToMany
       
//        Question q3=new Question();
//        q3.setQuestionId(103);
//        q3.setQuestion("What is use of hibernate");
//        
//        Answer2 a3=new Answer2();
//        a3.setAnswerId(1003);
//        a3.setAnswer("Hibernate is use for mapping");
//        a3.setQuestion(q3);
//       
//        Answer2 a4=new Answer2();
//        a4.setAnswerId(1004);
//        a4.setAnswer("It is a implementation of jpa");
//        a4.setQuestion(q3);
//        
//        
//        List<Answer2> list=new ArrayList<Answer2>();
//        list.add(a3);
//        list.add(a4);
        
        
        
        
//        q1.setAnswer(a1);
//        q2.setAnswer(a2);
        
        //Session
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        //Save
        //OneToOne
        session.save(q1);
        session.save(q2);
        session.save(a1);
        session.save(a2);
        
        //OneToMany
//        session.save(q3);
//        session.save(a3);
//        session.save(a4);
        
//        Question2 q=(Question2) session.get(Question2.class,103);
//        for(Answer2 a:q.getAnswers())
//        {
//        	System.out.println(a.getAnswer());
//        } 
//        
        tx.commit();
        
        //fetch
//       Question newQ= session.get(Question.class,101);
//       System.out.println(newQ.getQuestion());
//       System.out.println(newQ.getAnswer());
        
        session.close();
        factory.isClosed();
	}

}
