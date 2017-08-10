package com.softeem.DAO;

import java.util.List;

import com.softeem.DTO.Student;

public interface IStudentDAO {

	public boolean add(Student stu);
	
	public boolean del(Student stu);
	
	public boolean update(Student stu);
	
	public List<Student> findAll();
}
