package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;
import com.masai.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository eRepository;
	
	@Override
	public Employee addEmployeeDetails(Employee employee) {
		Employee employeeSave = eRepository.save(employee);
		return employeeSave;
	}

	@Override
	public List<Employee> getAllEmployeesDetails() throws EmployeeException {
		List<Employee> employeeDetails = eRepository.findAll();
		if(employeeDetails.size() == 0) {
			throw new EmployeeException("Employee Not Found..");
		}else {
			return employeeDetails;
		}
	}

	@Override
	public Employee getEmployeeById(Integer id) throws EmployeeException {
		Optional<Employee> opt = eRepository.findById(id);
		if(opt.isPresent()) {
			Employee employee =  opt.get();
			return employee;
		}else {
			throw new EmployeeException("Employee not found with this : "+id);
		}
		
	}

	@Override
	public Employee deleteEmployeeById(Integer id) throws EmployeeException {
		Optional<Employee> opt = eRepository.findById(id);
		if(opt.isPresent()) {
			Employee emd = opt.get();
			eRepository.delete(emd);
			return emd;
		}else {
			throw new EmployeeException("Employee not found with this : "+id);
		}
	
	}

	@Override
	public Employee updateEmployees(Employee employee) throws EmployeeException {
		Optional<Employee> opt = eRepository.findById(employee.getId());
		if (opt.isPresent()) {
			Employee updateEmployee = eRepository.save(employee);
			return updateEmployee;
			
		}else {
			throw new EmployeeException("Employee Not Found..");
		}
		
	}





}
