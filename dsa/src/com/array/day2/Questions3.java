package com.array.day2;

public class Questions3 {
	
	// find second max value given array
	
	public static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int secondMaxValaue(int[] arr) {
		int mx = findMax(arr);
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == mx) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int secondMax = findMax(arr);
		return secondMax;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,2,1,3,7,9,5};
		System.out.println(findMax(arr));
		System.out.println(secondMaxValaue(arr));
	}

}
