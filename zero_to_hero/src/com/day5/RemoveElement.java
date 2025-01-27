package com.day5;

public class RemoveElement {
	
	public static int removeElement(int[] arr, int k) {
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != k) {
				arr[index++] = arr[i];
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,3,2};
		int k = 2;
		System.out.println(removeElement(arr, k));
	}

}
