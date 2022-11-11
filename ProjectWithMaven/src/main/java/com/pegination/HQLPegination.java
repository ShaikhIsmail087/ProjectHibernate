package com.pegination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;

public class HQLPegination {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
//		Query<Student> query = s.createQuery("from student",Student.class);
		
		//implementing pegination using hibernate
		
//		query.setFirstResult(0);
//		query.setMaxResults(5);
//		List<Student> list = query.list();
		List<Student> list = s.createQuery("from Student ", Student.class).getResultList();
		for(Student st:list) 
		{
			System.out.println(st.getId()+" : "+st.getName()+" : "+st.getCity());
		}
		s.close();
		factory.close();
	}
}
