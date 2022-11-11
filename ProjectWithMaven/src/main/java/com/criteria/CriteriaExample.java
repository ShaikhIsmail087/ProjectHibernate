package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tut.Student;

public class CriteriaExample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Student.class);
		
//		c.add(Restrictions.eq("certi.course", "Android"));
		c.add(Restrictions.gt("id", 20));
//		c.add(Restrictions.like("certi.course", "Java%"));
		
		List<Student> list = c.list();
		for (Student student : list) {
			System.out.println(student);
		}
		
		session.close();
	}
}
