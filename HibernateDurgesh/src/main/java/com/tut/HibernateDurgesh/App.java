package com.tut.HibernateDurgesh;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started!" );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        
        System.out.println(factory);
        //Creating object of student class
        Student student=new Student();
        
        student.setId(101);
        student.setName("Deepak");
        student.setCity("Bihar");
        System.out.println(student);
        
        Student student2=new Student();
        student2.setId(102);
        student2.setName("Julie");
        student2.setCity("Nagpur");
        System.out.println(student2);
        
        //Creating object of address class
        Address ad=new Address();
        ad.setAddressId(310);
        ad.setStreet("street1");
        ad.setCity("hingna");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.234);
        System.out.println(ad);
        
       //Reading image
        
//        FileInputStream fis=new FileInputStream("src/main/java/pic.png");
//        byte[] data=new byte[fis.available()];
//        
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(student);
        session.save(student2);
        session.save(ad);
        tx.commit();
        session.close();
        factory.close();
        System.out.println("Done");
        
        
        System.out.println(factory.isClosed());
    }
}
