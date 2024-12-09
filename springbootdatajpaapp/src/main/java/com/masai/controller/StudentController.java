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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService sService;
	
//	http://localhost:8088/student
	@PostMapping("/student")
	public ResponseEntity<Student> registerStudentHandler(@RequestBody Student student) {
		Student registerStudent = sService.registerStudent(student);
		return new ResponseEntity<Student>(registerStudent, HttpStatus.CREATED);
	}
	
//	http://localhost:8088/student/2
	@GetMapping("/student/{r}")
	public ResponseEntity<Student> getStudentByIdHandler(@PathVariable("r") Integer rollNo){
		Student studentByRoll =  sService.getStudentById(rollNo);
		return new ResponseEntity<Student>(studentByRoll, HttpStatus.OK);
	}
	
//	http://localhost:8088/student
	@GetMapping("/student")
	public ResponseEntity<List<Student>> getAllStudentDataListHandler(){
		List<Student> allStudent = sService.getAllStudentDataList();
		return new ResponseEntity<List<Student>>(allStudent, HttpStatus.OK);
	}
	
//	http://localhost:8088/student/6
	@DeleteMapping("/student/{r}")
	public ResponseEntity<Student> deleteStudentByRollNoHandler(@PathVariable("r") Integer rollNo){
		Student deletedStudent = sService.deleteStudentByRollNo(rollNo);
		return new ResponseEntity<Student>(deletedStudent, HttpStatus.OK);
	}
	
//	http://localhost:8088/student
	@PutMapping("/student")
	public ResponseEntity<Student> updateStudentDataHandler(@RequestBody Student student){
		Student updatedStudent = sService.updateStudentData(student);
		return new ResponseEntity<Student>(updatedStudent, HttpStatus.ACCEPTED);
	}
	
	
//	http://localhost:8088/student/3?gmarks=50
	@PutMapping("/student/{roll}")
	public ResponseEntity<Student> updateStudentMarksByRollHandler(@PathVariable("roll") Integer rollNo, @RequestParam("gmarks") Integer gMarks){
		Student updatedStudent = sService.updateStudentMarksByRoll(rollNo, gMarks);
		return new ResponseEntity<Student>(updatedStudent,HttpStatus.ACCEPTED);
	}
	
//	http://localhost:8088/getStudent/Bangalore
	@GetMapping("/getStudent/{address}")
	public ResponseEntity<List<Student>> getStudentByAdressHandler(@PathVariable("address") String address){
		List<Student> students = sService.getStudentByAdress(address);
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
//	http://localhost:8088/getStudentMarks/900
	@GetMapping("/getStudentMarks/{marks}")
	public ResponseEntity<Student> getStudentByMarksHandler(@PathVariable("marks") Integer marks){
		Student students = sService.getStudentByMarks(marks);
		return new ResponseEntity<Student>(students, HttpStatus.OK);
	}
	
//	http://localhost:8088/getStudentMarksLessThen/900
	@GetMapping("/getStudentMarksLessThen/{marks}")
	public ResponseEntity<List<Student>> getStudentByLessThanMarksHandler(@PathVariable("marks") Integer marks){
		List<Student> students = sService.getStudentByLessThanMarks(marks);
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
//	http://localhost:8088/getStudentName/2
	@GetMapping("/getStudentName/{roll}")
	public ResponseEntity<String> getStudentNameByRollHandler(@PathVariable("roll") Integer rollNo){
		String studentNmae = sService.getStudentNameByRoll(rollNo);
		return new ResponseEntity<String>(studentNmae,HttpStatus.OK);
	}
	
//	http://localhost:8088/getStudenNameAndMarks/Bangalore
	@GetMapping("/getStudenNameAndMarks/{adrress}")
	public ResponseEntity<List<String>> getStudentNameAndMarksByAddressHandler(@PathVariable("adrress") String adrress){
		List<String> result = sService.getStudentNameAndMarksByAddress(adrress);
		return new ResponseEntity<List<String>>(result,HttpStatus.OK);
	}

}
