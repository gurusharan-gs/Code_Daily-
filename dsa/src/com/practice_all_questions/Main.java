package com.practice_all_questions;

import java.util.Arrays;

public class Main {
	
	public static int countOccurrences(int[] arr, int x) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				count++;
			}
		}
		return count;
	}
	
	
	
	public static int greaterCountOccurrences(int[] arr, int x) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > x) {
				count++;
			}
		}
		return count;
	}
	
	
	public static boolean isSorted(int[] arr) {
		boolean flag = true;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	
	public static int[] smallestAndLargestElements(int[] arr) {
		Arrays.sort(arr);
		return new int[]{arr[0], arr[arr.length-1]};
	}
	
	public static int floorArray(int[] arr, int k) {
		int ans = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] <= k) {
				ans = i;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,8,5,3,4,8};
		int x = 6;
		
//		System.out.println("count: "+ countOccurrences(arr, x));
//		System.out.println("count: "+ greaterCountOccurrences(arr, x));
//		System.out.println(isSorted(arr));
//		System.out.println();
//		int[] ans = smallestAndLargestElements(arr);
//		System.out.println(ans[0] +" "+ ans[1]);
		
		System.out.println(floorArray(arr, x));
		
	}
}
