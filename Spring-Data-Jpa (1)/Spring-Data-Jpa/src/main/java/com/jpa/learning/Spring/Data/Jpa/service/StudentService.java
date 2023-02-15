package com.jpa.learning.Spring.Data.Jpa.service;

import java.util.List;
import java.util.Optional;

import com.jpa.learning.Spring.Data.Jpa.Student;

public interface StudentService {
	List<Student> findAll();	
	void save(Student student);
	Optional <Student> FindById(long StudentId);
	
}
