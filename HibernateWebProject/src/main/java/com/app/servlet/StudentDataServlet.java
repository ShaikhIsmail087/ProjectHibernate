package com.app.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.IStudentDao;
import com.app.dao.impl.StudentDaoImpl;
import com.app.model.Student;

@SuppressWarnings("serial")
@WebServlet("/StudData")
public class StudentDataServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// create object for POJO-POJI
		IStudentDao dao=new StudentDaoImpl();
		//call get operation
		List<Student> st=dao.getAllStud();
		//add list to request memory
		req.setAttribute("list", st);
		//dispatch to UI
		req.getRequestDispatcher("Data.jsp").forward(req, resp);
	}
	
	
}
