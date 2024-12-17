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

import com.masai.entity.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmployeeDetailsHandler(@RequestBody Employee employee) {
		Employee saveEmployee = eService.addEmployeeDetails(employee);
		return new ResponseEntity<Employee>(saveEmployee, HttpStatus.CREATED);
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployeesDetailsHandler(){
		List<Employee> empDetails = eService.getAllEmployeesDetails();
		return new ResponseEntity<List<Employee>>(empDetails, HttpStatus.OK); 
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeByIdHandler(@PathVariable("id") Integer id) {
		Employee getEmployee = eService.getEmployeeById(id);
		return new ResponseEntity<Employee>(getEmployee, HttpStatus.OK);
	}

	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Employee> deleteEmployeeByIdHandler(@PathVariable("id") Integer id) {
		Employee deleteEmployee = eService.deleteEmployeeById(id);
		return new ResponseEntity<Employee>(deleteEmployee, HttpStatus.OK);
	}
	
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateEmployeeHandler(@RequestBody Employee employee) {
		Employee updateEmployee = eService.updateEmployees(employee);
		return new ResponseEntity<Employee>(updateEmployee, HttpStatus.CREATED);
	}
}
