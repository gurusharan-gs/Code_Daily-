package com.practices;

public class Demo {
	
	public static int findMax(int[] arr) {
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int secondMax(int[] arr) {
		int max = findMax(arr);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == max) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int result = findMax(arr);
		return result;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {4,1,8,6,9,10};
		System.out.println(findMax(arr));
		System.out.println(secondMax(arr));
	}

}
