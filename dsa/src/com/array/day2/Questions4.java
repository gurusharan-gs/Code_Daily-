package com.array.day2;

public class Questions4 {
	
	static int findFirstRepeatingNumber(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	
	static int findLastRepeatingNumber(int[] arr) {
		int n = arr.length;
		int ans = -1;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					ans = arr[i];
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {6,2,4,1,3,2,5,7,4,3};
		System.out.println(findFirstRepeatingNumber(arr));
		System.out.println(findLastRepeatingNumber(arr));
	}

}
