package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
//		for(int i=2;i<25;i++) 
//	      {
	  Configuration cfg=new Configuration();
      cfg.configure("hibernate.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      
      Student student1=new Student();
      student1.setId(14134);
      student1.setName("Salik Sahikh");
      student1.setCity("Mumbai");
      
      Certificate certificate=new Certificate();
      certificate.setCourse("Android");
      certificate.setDuration("2 months");
      student1.setCerti(certificate);
      
      Student student2=new Student();
      student2.setId(1212);
      student2.setName("Saad Shaikh");
      student2.setCity("Banglore");
      
      Certificate certificate2=new Certificate();
      certificate2.setCourse("Hibernate");
      certificate2.setDuration("1.5 months");
      student2.setCerti(certificate2);
      
//      Student student3=new Student();
//      Certificate certificate3=new Certificate();
//      for(int i=1;i<25;i++) 
//      {
//    	  student3.setId(i);
//          student3.setName("Name "+i);
//          student3.setCity("City "+i);
//          certificate3.setCourse("Java Course "+i);
//          certificate3.setDuration("Month "+i);
//          student3.setCerti(certificate3);
//      }
      Session s=factory.openSession();
      Transaction tx=s.beginTransaction();
      
      //objects save
      s.save(student1);
      s.save(student2);
      
      tx.commit();
      s.close();
      factory.close();
//	      }
	}
}
