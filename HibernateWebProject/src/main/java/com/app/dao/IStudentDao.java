package com.app.dao;

import java.util.List;

import com.app.model.Student;

public interface IStudentDao {
	
	public int saveStudent(Student s);
	public List<Student> getAllStud();
}
