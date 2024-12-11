package com.collectionfromwork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCode {
	
	public static void main(String[] args) {
		
		/**
		 * Array list is part of collection framework 
		 * It come to java.util package
		 * dynamic memory allocates
		 * automatically size increase
		 * ArrayLists provide dynamic resizing
		 */
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		System.out.println(list.contains(16));
		System.out.println(list.contains(6));
		list.add(5, 100);
		System.out.println(list);
		list.remove(5);
		System.out.println(list);
		list.set(4, 50);
		System.out.println(list);
		System.out.println("list size : "+ list.size());
		
		List<Integer> list1 = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
        
		list.addAll(list1);
//		list.clear();
		System.out.println(list.get(2));
		
		
	
		
		System.out.println(list);
		
	}

}
