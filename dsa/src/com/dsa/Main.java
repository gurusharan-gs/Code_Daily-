package com.dsa;

public class Main {
	
	static void reverce(int[] arr, int l, int r){
		while(l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}

	static void rotateArray(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverce(arr, 0, n-k-1);
		reverce(arr, n-k, n-1);
		reverce(arr, 0, n-1);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int k = 4;
		
			rotateArray(arr, k);
			for(int ans : arr) {
			System.out.print(ans+" ");
		}
	}

}
