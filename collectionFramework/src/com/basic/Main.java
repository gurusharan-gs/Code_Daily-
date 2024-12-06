package com.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(1);
		list.add(5);
		list.add(15);
		list.add(9);
		list.add(10);
		
		System.out.println(list);
		
//		list.sort((a, b) -> a-b);// sorting acc
//		list.sort((a, b) -> b-a);// sorting dec
		
//		List<String> fruts =  Arrays.asList("mango","banana","apple","watermola");
//		System.out.println(fruts);
		
//		System.out.println(list);
//		list.remove(2);
//		list.add(2, 50); // add the new value specific position
//		list.set(2, 100);// set replace with new value
//		System.out.println(list.contains(15)); // return true if value contains in list otherwise return false
//		System.out.println(list.size());
//		Collections.sort(list);
		
		
		System.out.println(list);
//		for(int i=0; i<list.size(); i++) {
//			System.out.print(list.get(i)+" ");
//		}
//		System.out.println();
//		for(int li: list) {
//			System.out.print(li+" ");
//		}
		
		
	}


}
