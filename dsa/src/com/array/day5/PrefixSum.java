package com.array.day5;

public class PrefixSum {
	
	public static int[] prefixSum(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			arr[i] += arr[i-1];
		}
		return arr;
	}
	

	
	public static void main(String[] args) {
		int[] arr = {2,1,3,4,5};
		prefixSum(arr);
		for(int ans : arr) {
			System.out.print(ans+" ");
		}
		
	}

}
