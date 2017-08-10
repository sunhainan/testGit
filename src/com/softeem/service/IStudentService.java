package com.softeem.service;

import com.softeem.DTO.Student;

public interface IStudentService {

	public void save(Student stu);
	
	
	public void remove(Student stu);
	
	public void update(Student stu);
	
	public void searchAll();
}
