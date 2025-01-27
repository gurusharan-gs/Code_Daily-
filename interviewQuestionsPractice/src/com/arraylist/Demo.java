package com.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(5,1,3,4,7,6,5,2,0);
		
		List<Integer> evenNum = numbers.stream()
				.filter(num -> num % 2 == 0)
				.toList();
		System.out.println(evenNum);
		
		List<Integer> oddNum = numbers.stream()
				.filter(num -> num % 2 == 1)
				.collect(Collectors.toList());
		System.out.println(oddNum);
		
		List<Integer> greaterNum = numbers.stream()
		                .filter(num -> num > 4)
		                .collect(Collectors.toList());
		System.out.println(greaterNum);
		
//		List<Integer> greaterNum =
		List<Integer> filterAndSort =numbers.stream()
				                            .filter(num -> num > 4)
											.sorted()
											.collect(Collectors.toList());
		System.out.println(filterAndSort);
		
		System.out.println(numbers);
		List<Integer> sortNum = numbers.stream()
				                       .sorted()
				                       .toList();
		System.out.println(sortNum);
		
		List<Integer> negativeVal = List.of(-10, -5, 0,1,-2, 5, 10, 15);
		List<Integer> negativeNumbers = negativeVal.stream()
												.filter(num -> num < 0)
												.collect(Collectors.toList());
				System.out.println(negativeNumbers);
				
				
		 List<String> names = List.of("John", "Alice", "Bob", "Jennifer", "Steve");		
		 List<String> greterNames = names.stream()
				                         .filter(str -> str.length() > 4)
				                         .collect(Collectors.toList());
		 System.out.println(greterNames);
				
		 List<String> namesStartingWithJ = names.stream()
				                                .filter(str -> str.startsWith("J"))
				                                .collect(Collectors.toList());
		 System.out.println(namesStartingWithJ);
		 
		 
		 List<String> upperCaseName = names.stream().map(str -> str.toUpperCase()).toList();
		 System.out.println(upperCaseName);
				
	}

}
