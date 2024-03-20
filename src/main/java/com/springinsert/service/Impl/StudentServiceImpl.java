package com.springinsert.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springinsert.model.Student;
import com.springinsert.repository.StudentRepository;
import com.springinsert.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student create (Student student) {
		
		return studentRepository.save(student);
	}

}
