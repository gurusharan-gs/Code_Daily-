package com.day2;

public class RemoveDuplicates {
	
	public static int removeDuplicates(int[] arr) {
		int index = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				arr[index++] = arr[i];
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] arr = {1,1,2,3,4,4};
		System.out.println(removeDuplicates(arr));
	}
}
