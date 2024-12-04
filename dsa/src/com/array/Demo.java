package com.array;

public class Demo {
	
	public static int floorArray(int[] arr, int k) {
		int ans = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] <= k) {
				ans = i;
			}
		}
		return ans;
	}
	
	public static int floorArray2(int[] arr, int k) {
	
		int ans = -1;
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(arr[mid] <= k) {
				ans = mid;
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return ans;
	}
	
	public static int missingNumber(int[] arr) {
		int n = arr.length+1;
		int totalSum = n*(n+1)/2;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		int missNumber = totalSum - sum;
		return missNumber;
	}
	
	public static void main(String[] args) {
//		System.out.println("Hello World..");
		
//		int[] arr = {1, 2, 8, 10, 11, 12, 19}; 
//		int k = 5;
//		int a = floorArray(arr, k);
//		int b = floorArray2(arr, k);
//		System.out.println(a);
//		System.out.println(b);
		
		
		int[] arr = {1, 2, 3, 4, 5, 7, 8}; 
		int ans = missingNumber(arr);
		System.out.println(ans);
	}

}
