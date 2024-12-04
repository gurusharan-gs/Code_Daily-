package com.array.day2;

public class Questions2 {
	
	// find the unique number in a given array where 
	// all the element are being repeated twice with
	// one value being unique
	
	public static int findUniqueValue(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		int ans = -1;
		for(int i=0; i<n; i++) {
			if(arr[i] > 0) {
				ans = arr[i];
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,1};
		System.out.println(findUniqueValue(arr));
	}

}
