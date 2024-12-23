package com.streamAPI.filterMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}

public class FilterMethods {
	
	public static boolean isPrime(int number) { 
		if(number <= 1) return false;
		for(int i=2; i<=Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 4, 13, 44, 5, 7, 9);
		
//		Collections.sort(list);
//		System.out.println();
		
		
		List<Integer> evenList =  list.stream().filter(i -> i % 2 == 0).toList();
//		System.out.println(evenList);
		
		List<Integer> primeNumbers = list.stream().filter(FilterMethods::isPrime).toList();
//		System.out.println(primeNumbers);
		
		
        List<Employee> employees = Arrays.asList(   
        		new Employee("Alice", 25),
                new Employee("Bob", 30),
                new Employee("Charlie", 35),
                new Employee("David", 22)
                );
        List<Employee> greaterEmp = employees.stream().filter(emp -> emp.age > 28).toList();
//        System.out.println(greaterEmp);
        greaterEmp.forEach(System.out::println);
        

             
	}

}
