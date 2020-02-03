package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;

@Service("service")
public class StudentServiceImpl implements StudentService {

private StudentDao dao;



@Autowired
	public StudentServiceImpl(StudentDao dao) {
	super();
	this.dao = dao;
}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.createStudent(student);
	}

	
}
