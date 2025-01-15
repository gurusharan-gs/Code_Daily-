package com.basic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void removeDuplicates(int[] arr) {
		Set<Integer> st = new HashSet<>();
		for(int ans : arr) {
			st.add(ans);
		}
		st.forEach(value -> System.out.print(value+" "));
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 4, 5, 3};
		removeDuplicates(arr);
	}

}
