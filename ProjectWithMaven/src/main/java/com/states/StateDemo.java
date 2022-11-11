package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {
	public static void main(String[] args) {
		//Practical of Hibernate Object States
		/*Transient state
		 *Persistent state
		 *Detached state 
		 *Removed state */
		System.out.println("Example: ");
		SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//creating student object:
		Student student=new Student();
		student.setId(1414);
		student.setName("Peter");
		student.setCity("ABC");
		student.setCerti(new Certificate("Java Hibernate Course","2 month"));
		//Student : Transient 
		
		Session s=f.openSession();
		Transaction tx=s.beginTransaction();
		s.save(student);
		//student: Persistent - session,database
		student.setName("Jhon");
		tx.commit();
		
		s.close();
		//student : Detached state
		student.setName("Sachin");
		System.out.println(student);
		f.close();
	}
}
