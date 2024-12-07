package com.array.day2;

public class Demo {
	
	// find the total number of pairs in the array 
		// whose sum is equal to the given value x
	static int countPairs(int[] arr, int x) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == x) {
					count++;
				}
			}
		}
		return count;
	}
	
	// find the unique number in a given array where 
	// all the element are being repeated twice with
	// one value being unique
	static int uniqueValue(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		int ans = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
			  ans = arr[i];
			}
		}
		return ans;
		
	}
	
	// find second max value given array
	static int maxValue(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	static int secondMaxValue(int[] arr) {
		int mx = maxValue(arr);
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == mx) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int secondmax = maxValue(arr);
		return secondmax;
	}
	
	
	static int findFirstRepeatingNumber(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {2,5,4,5,7,6,4};
//		int x = 11;
//		System.out.println(countPairs(arr, x));
//		System.out.println(uniqueValue(arr)); 
//		System.out.println(maxValue(arr));
//		System.out.println(secondMaxValue(arr));
		System.out.println(findFirstRepeatingNumber(arr));
		
			
		
		
	}

}
