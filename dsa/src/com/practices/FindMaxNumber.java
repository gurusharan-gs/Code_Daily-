package com.practices;

public class FindMaxNumber {
	
	public static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
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
		int ans = findMax(arr);
		return ans;
	}
	
	public static int findMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int secondMin(int[] arr) {
		int min = findMin(arr);
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == min) {
				arr[i] = Integer.MAX_VALUE;
			}
		}
		int ans = findMin(arr);
		return ans;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {4,5,18,1,10,15,23};
//		System.out.println("max value: "+findMax(arr));
//		System.out.println("second max: "+secondMax(arr));
		System.out.println();
		System.out.println("min value: "+findMin(arr));
		System.out.println("second min value: "+secondMin(arr));
	}

}
