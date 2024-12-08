package com.array.day4;

public class PracticeCode {

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void reverce(int[] arr, int i, int j) {
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	public static void rotateArray(int[] arr, int k) {
		int n = arr.length;
		k = k%n;
		reverce(arr, 0, k-n-1);
		reverce(arr, n-k, n-1);
		reverce(arr, 0, n-1);
	}

	public static void main(String[] args) {
//		int a = 3;
//		int b = 5;
//		swap(a, b);
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
		
		int[] arr = {1,2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		rotateArray(arr, 2);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
