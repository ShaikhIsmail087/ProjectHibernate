package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.tut.Student;

public class HQLExample {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session s=factory.openSession();
        //HQL Syntax
//        String query="from student where city='Mumbai'";
//        org.hibernate.Query q = s.createQuery("from Student as s where s.city=:x and s.name=:n");
        List<Student> list = s.createQuery("from Student where city='ABC'", Student.class).getResultList();
        //Single - (unique)
        //multiple-list
//        List<Student> list=q.list();
//        q.setParameter("x", "Mumbai");
//        q.setParameter("n", "ABC");
        for (Student student : list) {
			System.out.println(student.getName()+" : "+student.getCerti().getCourse());
		}
        System.out.println("----------------------------------------------");
        Transaction tx=s.beginTransaction();
        //delete query
//        org.hibernate.Query q2 = s.createQuery("delete from student s where s.city=:c",Student.class);
//        q2.setParameter("c", "ABC");
//        int r=q2.executeUpdate();
//        System.out.println("Deleted:"+r);
        //update query
//		org.hibernate.Query q3 = s.createQuery("update student set city=:c where name=:'n'", Student.class);
//		q3.setParameter("c", "ABC");
//		q3.setParameter("n", "Mumbai");
//		int r = q3.executeUpdate();
//      System.out.println("updated:"+r);
        
        s.close();
        factory.close();
	}
}
