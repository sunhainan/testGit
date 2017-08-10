package com.softeem.DAO.impl;

import java.util.List;

import com.softeem.DAO.IStudentDAO;
import com.softeem.DTO.Student;

public class StudentDAOImplBySql implements IStudentDAO{

	@Override
	public boolean add(Student stu) {
		System.out.println("sql:添加");
		return false;
	}

	@Override
	public boolean del(Student stu) {
		System.out.println("sql:删除");
		return false;
	}

	@Override
	public List<Student> findAll() {
		System.out.println("sql:查询所有");
		return null;
	}

	@Override
	public boolean update(Student stu) {
		System.out.println("sql:更新");
		return false;
	}

}
