package com.masai.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService sService;
     
	@PostMapping("/student")
	public ResponseEntity<Student> registerStudentHandler(@RequestBody Student student) {
		Student registerStudent = sService.registerStudent(student);
		return new ResponseEntity<Student>(registerStudent, HttpStatus.CREATED);
	}
	
//	@GetMapping("/student/{r}")
//	public ResponseEntity<Student> getStudentByIdHandler(@PathVariable("r") Integer rollNo){
//		Student studentByRoll =  sService.getStudentById(rollNo);
//		return new ResponseEntity<Student>(studentByRoll, HttpStatus.OK);
//	}
	
//	@GetMapping("/student")
//	public ResponseEntity<List<Student>> getAllStudentDataListHandler(){
//		List<Student> allStudent = sService.getAllStudentDataList();
//		return new ResponseEntity<List<Student>>(allStudent, HttpStatus.OK);
//	}
	
//	@DeleteMapping("/student/{r}")
//	public ResponseEntity<Student> deleteStudentByRollNoHandler(@PathVariable("r") Integer rollNo){
//		Student deletedStudent = sService.deleteStudentByRollNo(rollNo);
//		return new ResponseEntity<Student>(deletedStudent, HttpStatus.OK);
//	}
	
//	@PutMapping("/student")
//	public ResponseEntity<Student> updateStudentDataHandler(@RequestBody Student student){
//		Student updatedStudent = sService.updateStudentData(student);
//		return new ResponseEntity<Student>(updatedStudent, HttpStatus.ACCEPTED);
//	}

}
