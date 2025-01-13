package com.basic;

public class rotateArrays {
	
	public static void reverce(int[] arr, int i, int j) {
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	public static void rotatesArray(int[] arr, int k) {
		int n = arr.length;
		k = k%n;
		
		reverce(arr, 0, n-k-1);
		reverce(arr, n-k, n-1);
		reverce(arr, 0, n-1);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int k = 3;
		rotatesArray(arr, k);
		for(int ans: arr) {
			System.out.print(ans+" ");
		}
	}

}
