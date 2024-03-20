package com.springinsert.service;

import org.springframework.stereotype.Service;

import com.springinsert.model.Student;

@Service
public interface StudentService {
	
	public Student create(Student student);
}
