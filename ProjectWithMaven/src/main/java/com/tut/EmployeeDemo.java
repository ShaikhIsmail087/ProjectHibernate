package com.tut;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Employee e1=new Employee();
		e1.seteId(1004);
		e1.seteName("Salik Shaikh");
		e1.seteSalary(80000.0);
		
		Employee e2=new Employee();
		e2.seteId(1005);
		e2.seteName("Mustaba");
		e2.seteSalary(45000.0);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		s.save(e1);
		s.save(e2);
		tx.commit();
		s.close();
		factory.close();
	}
}
