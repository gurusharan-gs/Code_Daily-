package com.array;

import java.util.HashSet;
import java.util.Set;

public class Practices {
	
	// 1
	 public static int findMin(int[] arr) {
		 int min = Integer.MAX_VALUE;
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i] < min) {
				 min = arr[i];
			 }
		 }
		 return min;
	 }
	 
	 
	 // 2
	 public static void swap(int[] arr, int i, int j) {
		 int temp = arr[i];
		 arr[i] = arr[j];
		 arr[j] = temp;
	 }
	 public static void reverseArray(int[] arr) {
		 int n = arr.length;
		 int l = 0, r = n-1;
		 while(l < r) {
			 swap(arr, l, r);
			 l++;
			 r--;
		 }
	 }
	 
	 
	 // 3
	public static boolean isSorted(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	
	// 4
	public static int countOccurrences(int[] arr, int element) {
		int count = 0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] == element) {
//				count++;
//			}
//		}
		
		for(int i : arr) {
			if(i == element) {
				count++;
			}
		}
		return count;
	}
	
	//5
	 public static void moveZeros(int[] arr) {
		 int nonZero = 0;
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i] != 0) {
				 arr[nonZero++] = arr[i];
			 }
		 }
		 
		 while(nonZero < arr.length) {
			 arr[nonZero++] = 0;
		 }
	 }
	 
	 // 6
	 
	 public static int findDuplicate(int[] arr){
		 Set<Integer> set = new HashSet<>();
		 for(int num : arr) {
			 if(set.contains(num)) {
				 return num;
			 }
			 set.add(num);
		 }
		 return -1;
	 }
	
	public static void main(String[] args) {
//		  finding min value
//        int[] arr = {3, 1, 4, 1, 5};
//        System.out.println("The minimum element is: " + findMin(arr));
		
//		reverse Array
//        int[] arr = {1, 2, 3, 4};
//        reverseArray(arr);
//        for(int i: arr) {
//        	System.out.print(i+" ");
//        }
		
//		isSorted
//		int[] arr = {3, 1, 4, 1, 5};
//		int[] arr = {1, 2, 3, 4};
//		System.out.println(isSorted(arr));
		
//		Count Occurrences in array
//      int[] arr = {1, 2, 2, 3, 4, 2};
//      int element = 2;
//      System.out.println("Occurrences of " + element + ": " + countOccurrences(arr, element));
		
		
//        int[] arr = {0, 1, 2, 0, 3, 4};
//        moveZeros(arr);
//        System.out.print("Array after moving zeros: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
		
        int[] arr = {1, 2, 3, 4, 5, 2};
        System.out.println("First duplicate: " + findDuplicate(arr));
		
		
	}

}
