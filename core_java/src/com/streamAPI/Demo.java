package com.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,20,15,50,33,5);
		List<Integer> newList = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> newList2 = list.stream().filter(i -> i > 20).collect(Collectors.toList());
		System.out.println(newList2);
		
	}

}
