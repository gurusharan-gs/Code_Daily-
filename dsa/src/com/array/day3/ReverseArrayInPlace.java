package com.array.day3;

public class ReverseArrayInPlace {
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void reverseArrayInPlace(int[] arr) {
		int i = 0, j = arr.length-1;
		while(i<j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
	    reverseArrayInPlace(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
