package com.day5;

public class BinaryArrayOneAndZero {
	
	public static void separateOneZero(int[] arr) {
		int left = 0, right = arr.length-1;
		
		while(left < right) {
			if(arr[left] == 0 && arr[right] == 1) {
				int tepm = arr[left];
				arr[left] = arr[right];
				arr[right] = tepm;
			}
			left++;
			right--;
			if(arr[left] == 1) {
				left++;
			}
			if(arr[right] == 0) {
				right--;
			}
		}
	}
	
	 public static void separateZerosAndOnes(int[] arr) {
		 int index = 0;
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i] != 0) {
				 arr[index++] = arr[i];
			 }
		 }
		 while(index < arr.length) {
			 arr[index++] = 0;
		 }
	 }
	 
	 public static void moveZerosEnd(int[] arr) {
		 int index = 0;
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i] != 0) {
				 arr[index++] = arr[i];
			 }
		 }
		 while(index < arr.length) {
			 arr[index++] = 0;
		 }
	 }
	
	public static void main(String[] args) {
		
		int[] arr = {0,1,0,2,0,3,0,4};
//		separateOneZero(arr);
//		separateZerosAndOnes(arr);
        moveZerosEnd(arr);
		for(int ans : arr) {
			System.out.print(ans +" ");
		}
	}

}
