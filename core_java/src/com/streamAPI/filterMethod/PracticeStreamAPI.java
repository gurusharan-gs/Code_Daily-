package com.streamAPI.filterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


 class Employee1{
	String name;
	int salary;
	
	public Employee1(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}

public class PracticeStreamAPI {
	
	public static void main(String[] args) {
//
//		List<Employee1> employees = Arrays.asList(
//				
//				new Employee1("Alice", 75000),
//				new Employee1("Bob", 50000),
//				new Employee1("Catherine", 90000),
//				new Employee1("David", 40000)
//				
//				);
		
//		List<Employee1> sortedEmployees = employees.stream()
//				.sorted(Comparator.comparingInt(emp -> emp.salary))
//				.collect(Collectors.toList());
//		System.out.println(sortedEmployees);
		
//		List<Employee1> sortedBySalaryAsc = employees.stream()
//                .sorted(Comparator.comparingInt(emp -> emp.salary))
//                .collect(Collectors.toList());
//		        System.out.println("Employees sorted by salary (ascending):");
//	            sortedBySalaryAsc.forEach(System.out::println);
	            
	            
//		List<Integer> numbers = List.of(10, 20, 50, 40, 30);
//		Optional<Integer> opt = numbers.stream().sorted((a, b) -> b - a).skip(1).findFirst();
//		System.out.println(opt);
		
		
		  List<Integer> numbers = List.of(10, 20, 20, 30, 40, 40, 50);
		// Get unique values using Stream API
//		  List<Integer> uniqueNumbers = numbers.stream().distinct().toList();
//		  System.out.println(uniqueNumbers);
		  
		  // finding max value in given list...
		  Optional<Integer> maxNumbers = numbers.stream().max(Integer::compareTo);
		  System.out.println(maxNumbers);
	
	}

}
