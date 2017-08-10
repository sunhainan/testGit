package com.softeem.service.impl;

import com.softeem.DAO.IStudentDAO;
import com.softeem.DTO.Student;
import com.softeem.service.IStudentService;

public class StudentServiceImpl implements IStudentService{

	private IStudentDAO sd;
	
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public StudentServiceImpl(IStudentDAO sd) {
		super();
		this.sd = sd;
	}



	@Override
	public void remove(Student stu) {
		sd.del(stu);
		System.out.println("service:�Ƴ�");
		
	}

	@Override
	public void save(Student stu) {
		sd.add(stu);
		System.out.println("service:���");
		
	}

	@Override
	public void searchAll() {
		sd.findAll();
		System.out.println("service:��ѯ");
		
	}

	@Override
	public void update(Student stu) {
		sd.update(stu);
		System.out.println("service:����");	
	}

}
