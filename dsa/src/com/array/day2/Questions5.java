package com.array.day2;import java.time.chrono.MinguoChronology;

public class Questions5 {
	
	static int findMinimumValue(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	static int secondMinValue(int[] arr) {
		int min = findMinimumValue(arr);
		for(int i=0; i<arr.length; i++) {
			if(arr[i]== min) {
				arr[i] = Integer.MAX_VALUE;
			}
		}
		int minValue = findMinimumValue(arr);
		return minValue;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,1,3,7,9,5};
		System.out.println(findMinimumValue(arr));
		System.out.println(secondMinValue(arr));
	}

}
