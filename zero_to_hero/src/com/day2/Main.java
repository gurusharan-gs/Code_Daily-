package com.day2;

public class Main {
	
	public static int missingNumber(int[] arr) {
		int n = arr.length + 1;
		int exaptedSum = n*(n+1)/2;
		int actulSum = 0;
		for(int ans : arr) {
			actulSum += ans;
		}
		return exaptedSum - actulSum;
	}
	
	public static int removeDuplicates(int[] arr) {
		int count = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				arr[count++] = arr[i];
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6};
//		System.out.println(removeDuplicates(arr));
		System.out.println(missingNumber(arr));
	}

}
