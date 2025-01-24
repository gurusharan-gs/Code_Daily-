package com.revision;

public class Main {
	
	public static int missingNumber(int[] arr) {
		int n = arr.length + 1 ;
		int expectedSum = n * (n+1) / 2;
		int actulSum = 0;
		for(int ans : arr) {
			actulSum += ans;
		}
		return expectedSum - actulSum;
	}
	
	public static int moveZeros(int[] arr) {
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6};
		System.out.println(missingNumber(arr));
	}

}
