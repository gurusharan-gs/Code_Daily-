package com.collectionfromwork;

import java.util.HashSet;
import java.util.Set;

public class HashSetCode {
	
	public static void main(String[] args) {
		
		/**
		 * HashSet store unique elements 
		 * HashSet doesn’t maintain order of elements
		 * HashSet Uses HashMap internally. to store values
		 */
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(20);
		set.add(34);
		set.add(5);
		set.add(54);
		set.add(9);
		
		System.out.println(set);
		System.out.println(set.contains(34));
		System.out.println(set.contains(100));
		System.out.println("size: "+set.size());
		
		System.out.println(set.isEmpty());
		
		set.remove(20);
		
		System.out.println(set);
	
	}

}
