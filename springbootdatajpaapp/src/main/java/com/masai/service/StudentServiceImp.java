package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Student;
import com.masai.exception.StudentException;
import com.masai.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentRepository sRepository;

	@Override
	public Student registerStudent(Student student) {
		Student saveStudent = sRepository.save(student);
		return saveStudent;
	}

	@Override
	public Student getStudentById(Integer rollNo) throws StudentException {
		Optional<Student> opt = sRepository.findById(rollNo);
		if(opt.isPresent()) {
			Student student = opt.get();
			return student;
		}else {
			throw new StudentException("Student is not with this roll: "+rollNo);
		}
		
	}

	@Override
	public List<Student> getAllStudentDataList() throws StudentException {
		List<Student> getAllStudent = sRepository.findAll();
		if(getAllStudent.size() == 0) {
			throw new StudentException("Student don't exsist..");
		}else {
			return getAllStudent;
		}
	}

	@Override
	public Student deleteStudentByRollNo(Integer rollNo) throws StudentException {
		Optional<Student> opt = sRepository.findById(rollNo);
		if(opt.isPresent()) {
			Student deleteStudent = opt.get();
			sRepository.delete(deleteStudent);
			return deleteStudent;
		}else {
			throw new StudentException("Student is not with this roll: "+rollNo);
		}
		
	}

	@Override
	public Student updateStudentData(Student student) throws StudentException {
		Optional<Student> opt = sRepository.findById(student.getRollNo());
		if(opt.isPresent()) {
			Student updateStudent = sRepository.save(student);
			return updateStudent;
		}else {
			throw new StudentException("Student is not with this roll");
		}
		
	}

	@Override
	public Student updateStudentMarksByRoll(Integer rollNo, Integer gMarks) throws StudentException {
		Student existingStudent = sRepository.findById(rollNo).orElseThrow(() -> new StudentException("Student dose not exist with roll: "+rollNo));
		existingStudent.setMarks(existingStudent.getMarks()+gMarks);
		return sRepository.save(existingStudent);
	}

	@Override
	public List<Student> getStudentByAdress(String address) throws StudentException {
		List<Student> student = sRepository.findByAddress(address);
		if(student.isEmpty()) {
			throw new StudentException("No student found with this address: "+address);
		}
		
		return student;
	}

	@Override
	public Student getStudentByMarks(Integer marks) throws StudentException {
		Optional<Student> opt = sRepository.findByMarks(marks);
		return opt.orElseThrow(() -> new StudentException("Student dose not exist with maarks :"+marks));
	}

	@Override
	public List<Student> getStudentByLessThanMarks(Integer marks) throws StudentException {
		List<Student> students = sRepository.findByMarksLessThan(marks);
		if(students.isEmpty()) {
			throw new StudentException("No student found with this marks: "+marks);
		}
		
		return students;
	}



}
