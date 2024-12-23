package com.streamAPI.filterMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;


public class MapMethods {
	
	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		 
//		 for(int i=0; i<numbers.size(); i++) {
//			 System.out.print(numbers.get(i)*2+" ");
//		 }
//		 
//		 System.out.println();
//		 for(int i : numbers) {
//			 System.out.print(i*2+" ");
//		 }
		
		 
		List<Integer> doubleNum = numbers.stream().map(num -> num*2).collect(Collectors.toList());
//		System.out.println(doubleNum);
		
	    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
	    
	    List<String> upperCaseName = names.stream().map(String::toUpperCase).toList();
//	    System.out.println(upperCaseName);
	    
	    List<String> lowerCaseName = names.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());
//	    System.out.println(lowerCaseName);
		
		
	    List<Integer> wordsName1 = names.stream().map(String::length).collect(Collectors.toList());
//	    System.out.println(wordsName1);
	    
	    List<Integer> wordsName2 = names.stream().map(name -> name.length()).collect(Collectors.toList());
//	    System.out.println(wordsName2);
	    	
	    
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25),
                new Employee("Bob", 30),
                new Employee("Charlie", 35)
            );
        
        List<String> nameOfEmp = employees.stream().map(emp -> emp.name).toList();
//        System.out.println(nameOfEmp);
        
	    	
        List<Integer> ageOfEmp = employees.stream().map(emp -> emp.age).toList();
//        System.out.println(ageOfEmp);
        
        // Convert each number to a string
        List<String> stringNumber = numbers.stream().map(String::valueOf).toList();
//        System.out.println(stringNumber);
        
     // Calculate squares of each number
        List<Integer> squaredNumbers = numbers.stream().map(num -> num*num).toList();
        System.out.println(squaredNumbers);
        
	    		
	}

}
