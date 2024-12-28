package com.streamAPI.filterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {
	
	public static void main(String[] args) {
		
		  List<Integer> numbers = List.of(10, 20, 20, 30, 40, 40, 50);
		  
		  // finding max value in this list
		  Optional<Integer> maxValue = numbers.stream().max(Integer::compareTo);
//		  System.out.println(maxValue);
		  
		  // finding second max value in this list
		  Optional<Integer> secondMaxValue = numbers.stream().sorted((a,b)-> b-a).skip(1).findFirst();
//		  System.out.println(secondMaxValue);
		  
		  List<Integer> value = numbers.stream().sorted((a,b)-> b-a).toList();
//		  System.out.println(value);
		  
		  
		  // find second max value
		  int[] arr = {1,2,3,4,5,6,7};
		  List<Integer> list = new ArrayList<>();
		  for(int num : arr) {
			  list.add(num);
		  }
		  
//		  System.out.println(list);
		  Optional<Integer> mValue = list.stream().max(Integer::compareTo);
		  System.out.println(mValue);
		  
		  Optional<Integer> sMValue = list.stream().sorted((a,b) -> b-a).skip(1).findFirst();
		  System.out.println(sMValue);
		
	}

}
