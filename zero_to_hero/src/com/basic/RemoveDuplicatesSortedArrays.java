package com.basic;

public class RemoveDuplicatesSortedArrays {
	
	public static int removeDuplicates(int[] arr) {
		if(arr.length == 0) {
			return 0;
		}
		
		int uniqueIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[uniqueIndex]) {
				uniqueIndex++;
				arr[uniqueIndex] = arr[i];
			}
		}
		return uniqueIndex + 1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 3, 3, 4};
		System.out.println(removeDuplicates(arr));
	}

}
