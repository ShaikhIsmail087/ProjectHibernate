package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.Employee;
import com.app.Person;
import com.app.Student;
import com.app.model.Address1;
import com.app.model.Classes;
import com.app.model.Employee1;
import com.app.model.Person1;
import com.app.model.Student1;
import com.app.model.Student2;
import com.app.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		//Table Per class
	  /*try(Session session=HibernateUtil.getSf().openSession())
		{
			Transaction tx=session.beginTransaction();
			Student1 st=new Student1();
			st.setStdId(1001);
			st.setStdName("Amjad");
			Address1 add=new Address1();
			add.setStdId(101);
			add.setStdName("Rashid");
			add.setVillage("GH");
			add.setHouse_no(011);
			add.setCity("Hyd");
			Classes cs=new Classes();
			cs.setStdId(102);
			cs.setStdName("naseem");
			cs.setClass_name("MCA");
			session.save(st);
			session.save(add);
			session.save(cs);
			tx.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		//Table Per subclass
			/*	try(Session session=HibernateUtil.getSf().openSession())
				{
					Transaction tx=session.beginTransaction();
					Person p=new Person();
					p.setPerId(101);
					p.setPerName("Aslam");
					Employee emp=new Employee();
					emp.setPerId(102);
					emp.setPerName("Kalam");
					emp.setEmpSal(5e3);
					Student st=new Student();
					st.setPerId(301);
					st.setPerName("Alam");
					st.setStdFee(505);
					st.setGrade("B+");
					session.save(p);
					session.save(emp);
					session.save(st);
					tx.commit();
					session.close();
				}catch (Exception e) {
					e.printStackTrace();
				}*/
		//Table Per concrete class
		try(Session session=HibernateUtil.getSf().openSession())
		{
			Transaction tx=session.beginTransaction();
			Person1 p=new Person1();
			p.setPerId(101);
			p.setPerName("Amir");
			Employee1 emp=new Employee1();
			emp.setPerId(201);
			emp.setPerName("Salam");
			emp.setEmpSal(5e3);
			emp.setEmpProj("P1");;
			Student2 st=new Student2();
			st.setPerId(301);
			st.setPerName("Alim");
			st.setStdFee(6e3);
			st.setGrade("A+");
			session.save(p);
			session.save(emp);
			session.save(st);
			tx.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
