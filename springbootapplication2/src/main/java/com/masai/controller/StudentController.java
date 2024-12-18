package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService sService;
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudentHandler(@RequestBody Student student){
		Student saveStudent = sService.addStudent(student);
		return new ResponseEntity<Student>(saveStudent, HttpStatus.CREATED);
	}
	
	@GetMapping("/student")
	public ResponseEntity<List<Student>> getAllStudentHandler(){
		List<Student> studentList = sService.getAllStudent();
		return new ResponseEntity<List<Student>>(studentList, HttpStatus.OK);
	}
	
	@GetMapping("/student/{n}")
	public ResponseEntity<List<Student>> getFindByNameHandler(@PathVariable("n") String name){
		List<Student> studentList = sService.getFindByName(name);
		return new ResponseEntity<List<Student>>(studentList, HttpStatus.OK);
	}
	
}
