package com.arraylistday1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - $" + salary;
    }
}

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class Demo {
	
	private static boolean isPrime(int number) {
	    if (number <= 1) return false;
	    for (int i = 2; i <= Math.sqrt(number); i++) {
	        if (number % i == 0) return false;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
//		
//	    List<String> names = new ArrayList<>();
//	        names.add("Alice");
//	        names.add("Bob");
//	        names.add("Andrew");
//	        names.add("Catherine");
//	        names.add("Alex");
//	        
//		        List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
//		        System.out.println(filteredNames);
	        
//	        List<Integer> numbers = new ArrayList<>();
//	        numbers.add(10);
//	        numbers.add(15);
//	        numbers.add(20);
//	        numbers.add(25);
//	        numbers.add(30);
	        
//		       List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
//		       System.out.println(evenNumbers);
	       
//	       List<String> words = List.of("hello", "stream", "filter", "java", "world");
//		      List<String> longWords = words.stream().filter(word -> word.length() > 5).collect(Collectors.toList());
//		      System.out.println(longWords);
		      
		
//		 List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//			 List<Integer> oddNumbers = numbers.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
//			 System.out.println(oddNumbers);
		   
		
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("Alice", 75000));
//        employees.add(new Employee("Bob", 50000));
//        employees.add(new Employee("Catherine", 90000));
//        employees.add(new Employee("David", 40000));
//        
//        List<Employee> highEarners = employees.stream()
//				        		.filter(emp -> emp.salary > 60000)
//				        		.collect(Collectors.toList());
//        
//        System.out.println("Employees earning more than $60,000:");
//        highEarners.forEach(System.out::println);
		
		
//		Filter Prime Numbers
//        List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> primeNumbers = numbers.stream()
//                                            .filter(Demo::isPrime)
//                                            .collect(Collectors.toList());
//        System.out.println("Prime numbers: " + primeNumbers);
		
		
//	      List<String> names = List.of("John", "Jack", "Jill", "Jane", "Paul", "Joan");
//		
//	      List<String> updateNames = names.stream().filter(name -> name.toLowerCase().contains("jo")).collect(Collectors.toList());
//		  System.out.println(updateNames);
		
//		List<Integer> numbers = List.of(5, 10, 15, 20, 25, 30);
//		int threshold = 15;
//		List<Integer> greaterThanThreshold = numbers.stream().filter(num -> num > threshold).collect(Collectors.toList());
//		System.out.println(greaterThanThreshold);
		
		
		
//		List<String> words = List.of("madam", "hello", "racecar", "world", "level");
//		 List<String> palindromes = words.stream().filter(word -> word.equals(new StringBuilder(word).reverse().toString())).collect(Collectors.toList());
//		 System.out.println(palindromes);
//		
		
		
	       List<Student> students = new ArrayList<>();
	        students.add(new Student("Alice", 85));
	        students.add(new Student("Bob", 40));
	        students.add(new Student("Charlie", 65));
	        students.add(new Student("David", 30));
	        
	        List<Student> passingStudents = students.stream().filter(std -> std.marks > 50).collect(Collectors.toList());
	        System.out.println(passingStudents);
	        passingStudents.forEach(System.out::println);
		
		
    }
	
}






