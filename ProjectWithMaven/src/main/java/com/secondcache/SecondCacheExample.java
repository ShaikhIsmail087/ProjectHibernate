package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class SecondCacheExample {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session s1=factory.openSession();
		//first 
		Student student1= s1.get(Student.class, 1212);
		System.out.println(student1);
		
		s1.close();
		
		Session s2=factory.openSession();
		//second
		Student student2= s2.get(Student.class, 1212);
		System.out.println(student2);
		
		s2.close();
	}
}
