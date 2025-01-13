package com.basic;

public class ZerosAndOnes {
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
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
	
	
	public static void main(String[] args) {
		int[] arr = {0,1,0,1,0,1,0,1,0,1};
		zeroAndOne(arr);
		for(int ans : arr) {
			System.out.print(ans+" ");
		}
	}
	

}
