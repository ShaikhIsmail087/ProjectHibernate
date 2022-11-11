package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SQLExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		//SQL query
		String q="select * from student";
		
		NativeQuery nq = s.createSQLQuery(q);
		
		List<Object[]> list = nq.list();
		
		for(Object[] st:list) 
		{
			System.out.println(st[4]+" : "+st[3]);
		}
		
		s.close();
		factory.close();
	}
}
