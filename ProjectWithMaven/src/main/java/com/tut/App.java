package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        System.out.println( "Project Started" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
//        SessionFactory factory=new Configuration().configure().buildSessionFactory();
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
        
        //creating student
        Student st=new Student();
        st.setId(103);
        st.setName("Ahmed Shaikh");
        st.setCity("Mum");
        System.out.println(st);
        
        //creating object of address class
        Address ad=new Address();
        ad.setStreet("street8");
        ad.setCity("Mum");
        ad.setOpen(true);
        ad.setAddDate(new Date());
        ad.setX(1234.234);
        
        //Reading image
        FileInputStream fis=new FileInputStream("src/main/java/pic1.jfif");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session session = factory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        factory.close();
        System.out.println("done....");
    }
}
