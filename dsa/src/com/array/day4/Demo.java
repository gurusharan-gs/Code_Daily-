package com.array.day4;

public class Demo {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void reverce(int[] arr, int i, int j) {
		while(i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	public static void reverce1(int[] arr) {
		int i = 0, j = arr.length-1;
		while(i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	public static void rotateArrayKTimes(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverce(arr, 0, n-k-1);
		reverce(arr, n-k, n-1);
		reverce(arr, 0, n-1);
	}
	
	public static void zeroAndOne(int[] arr) {
		int n = arr.length;
		int left = 0, right = n-1; 
		
		while(left < right) {
			if(arr[left] == 1 && arr[right] == 0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			if(arr[left] == 0) {
				left++;
			}
			if(arr[right] == 1) {
				right--;
			}
		}
	}
	
	public static void evenAndOdds(int[] arr) {
		int n = arr.length;
		int left = 0, right = n-1;
		
		while(left < right) {
			if(arr[left] % 2 == 1 && arr[right] % 2 == 0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			if(arr[left] % 2==0) {
				left++;
			}
			if(arr[right] % 2==1) {
				right--;
			}
		}
	}
	
	public static void squareNegitiveValue(int[] arr) {
		int n = arr.length;
		int left = 0, right = n-1, k = 0;
		int[] ans = new int[n];
		
		while(left <= right) {
			if(Math.abs(arr[left]) > Math.abs(arr[right])) {
				ans[k++] = arr[left] * arr[left];
				left++;
			}else {
				ans[k++] = arr[right] * arr[right];
				right--;
			}
		}
		reverce1(ans);
		for(int i : ans) {
			System.out.print(i+" ");
		}
	}
	
	
	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
//		int k = 2;
//		rotateArrayKTimes(arr, k);
		
//		int[] arr = {1,0,1,0,1,0,1,0};
//		zeroAndOne(arr);
		
//		int[] arr = {4,2,9,3,1,2,5,6};
//		evenAndOdds(arr);
		
		int[] arr = {-10,-5,-2,1,6};
		squareNegitiveValue(arr);
//		for(int i : arr) {
//			System.out.print(i+" ");
//		}
	}

}
