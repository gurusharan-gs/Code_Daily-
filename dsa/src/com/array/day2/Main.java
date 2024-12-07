package com.array.day2;

public class Main {
	
	// find the total number of pairs in the array 
	// whose sum is equal to the given value x
	static int pairSum(int[] arr, int target) {
		int ans = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					ans++;
				}
			}
		}
		return ans;
	}
	
	static int tripleSum(int[] arr, int target) {
		int ans = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
                for(int k=j+1; k<arr.length; k++) {
    				if(arr[i] + arr[i] + arr[k] == target) {
    					ans++;
    				}
                }
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,7,9,3,4,5,6,6};
		int target = 12;
//		System.out.println(pairSum(arr, target));
		System.out.println(tripleSum(arr, target));
	}

}
