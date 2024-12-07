package com.masai.service;

import com.masai.entity.Student;
import com.masai.exception.StudentException;
import java.util.*;



public interface StudentService {
	
	public Student registerStudent(Student student);
	
	public Student getStudentById(Integer rollNo)throws StudentException;

	public List<Student> getAllStudentDataList()throws StudentException;
	
	public Student deleteStudentByRollNo(Integer rollNo)throws StudentException;
	
	public Student updateStudentData(Student student)throws StudentException;
	
	public Student updateStudentMarksByRoll(Integer rollNo, Integer gMarks)throws StudentException;
	
	public List<Student> getStudentByAdress(String address)throws StudentException;
	
	public Student getStudentByMarks(Integer marks)throws StudentException;
	
	public List<Student>  getStudentByLessThanMarks(Integer marks)throws StudentException;

}
