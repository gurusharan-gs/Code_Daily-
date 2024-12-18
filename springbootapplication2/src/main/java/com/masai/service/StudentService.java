package com.masai.service;

import java.util.List;

import com.masai.entity.Student;
import com.masai.exception.StudentException;

public interface StudentService {
	
	public Student addStudent(Student student);
	
	public List<Student> getAllStudent()throws StudentException;
	
	public List<Student> getFindByName(String name)throws StudentException;

}
