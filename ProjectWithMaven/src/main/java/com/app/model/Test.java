package com.app.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		for(int i=11;i<=20;i++) 
		{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Address addr=new Address();
		addr.setHno("hno "+i);
		addr.setLoc("Mumbai "+i);
		Employee1 emp=new Employee1();
		emp.setEmpId(i);
		emp.setEmpName("employee "+i);
		emp.setEmpSal(15e3);
		emp.setAddr(addr);
		session.save(emp);
		tx.commit();
		session.close();
		factory.close();
		}
	}

}
