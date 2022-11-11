package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.IStudentDao;
import com.app.dao.impl.StudentDaoImpl;
import com.app.model.Student;

@SuppressWarnings("serial")
@WebServlet("/insertStud")
public class StudentInsertServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//read data from index.jsp
		String sid=req.getParameter("sid");
		String stdName=req.getParameter("sname");
		String sfee=req.getParameter("sfee");
		String sage=req.getParameter("age");
		String smob=req.getParameter("mob");
		//parse the data
		int stdId=Integer.parseInt(sid);
		double stdFee=Double.parseDouble(sfee);
		int age=Integer.parseInt(sage);
		int mob=Integer.parseInt(smob);
		//create the object in model class
		Student st=new Student();
		//set the data in model class
		st.setStdId(stdId);
		st.setStdName(stdName);
		st.setStdFee(stdFee);
		st.setStdAge(age);
		st.setMob(mob);
		//create the object POJO-POJI
		IStudentDao dao=new StudentDaoImpl();
		//call operation saveStudent
		int resStd=dao.saveStudent(st);
		//final message
		String msg="Student '"+resStd+"' created";
		//add message
		req.setAttribute("message", msg);
		//request dispatcher
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
	
}
