package com.app.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.dao.IStudentDao;
import com.app.model.Student;

public class StudentDaoImpl implements IStudentDao{
	
	org.hibernate.SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	public int saveStudent(Student s) {
		int stdId=0;
		try
		{
			Serializable st=session.save(s);
			stdId=(Integer) st;
			tx.commit();
		}catch(Exception e) 
		{
			tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
		return stdId;
	}

	@SuppressWarnings("unchecked")
	public List<Student> getAllStud() {
		// it will select data from emptab
		String hql="from "+Student.class.getName();
		//List<Student> stud=null;
		Session session=sf.openSession();
		Query<Student> q=session.createQuery(hql);
		List<Student> stud=q.list();
		//send this data to UI it display as Table
		
		return stud;
	}
	
	
}
