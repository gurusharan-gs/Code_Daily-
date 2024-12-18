package com.masai.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.entity.Student;
import com.masai.exception.StudentException;
import com.masai.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository sRepository;

	@Override
	public Student addStudent(Student student) {
		Student saveStudent = sRepository.save(student);
		return saveStudent;
	}

	@Override
	public List<Student> getAllStudent()throws StudentException {
		List<Student> allStudent = sRepository.findAll();
		if(allStudent.size() == 0) {
			throw new StudentException("Student not found..");
		}else {
			return allStudent;
		}
	}

	@Override
	public List<Student> getFindByName(String name) throws StudentException {
		List<Student> student = sRepository.findByName(name);
		if(student.isEmpty()) {
			throw new StudentException("No Student found with : "+name);
		}else {
			return student;
		}
	}

}
