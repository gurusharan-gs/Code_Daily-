package com.masai.service;

import java.util.List;

import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;

public interface EmployeeService {
	
	public Employee addEmployeeDetails(Employee employee);
	
	public List<Employee> getAllEmployeesDetails()throws EmployeeException;
	
	public Employee getEmployeeById(Integer id)throws EmployeeException;
	
	public Employee deleteEmployeeById(Integer id)throws EmployeeException;
	
	public Employee updateEmployees(Employee employee)throws EmployeeException;

}
