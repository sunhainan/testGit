package com.softeem.DAO.impl;

import java.util.List;

import com.softeem.DAO.IStudentDAO;
import com.softeem.DTO.Student;

public class StudentDAOImplByXml implements IStudentDAO{

	@Override
	public boolean add(Student stu) {
		System.out.println("xml:���");
		return false;
	}

	@Override
	public boolean del(Student stu) {
		System.out.println("xml:ɾ��");
		return false;
	}

	@Override
	public List<Student> findAll() {
		System.out.println("xml:��ѯ����");
		return null;
	}

	@Override
	public boolean update(Student stu) {
		System.out.println("xml:����");
		return false;
	}

}
