package com.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static boolean isPrime(int number) {
		if(number <= 1) return false;
		for(int i=2; i<=Math.sqrt(number); i++) {
			if(number % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
//		List<Integer> list = Arrays.asList(2,4,20,15,50,33,5);
//		List<Integer> newList = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
//		System.out.println(newList);
//		
//		List<Integer> newList2 = list.stream().filter(i -> i > 20).collect(Collectors.toList());
//		System.out.println(newList2);
//		
//		List<Integer> num = Arrays.asList(2,4,20,15,50,33,5);
//		List<Integer> primeNumber = num.stream().filter(Demo::isPrime).collect(Collectors.toList());
//		System.out.println(primeNumber);
		
		
	   String[] str = {"Alice", "Bob", "Charlie"};
	   List<String> list = new ArrayList<>();
	   
	   for(String i : str) {
		   list.add(i);
	   }
		
	   list.stream().map(String::toUpperCase).forEach(System.out::println);
	   
//	   System.out.println(list);
		
	}

}
