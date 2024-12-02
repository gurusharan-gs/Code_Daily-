package com.array;

import java.util.Arrays;

public class CountOccurrences {
	
	public static int countOccurrences(int[] arr, int x) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				count++;
			}
		}
		return count;
	}
	
	public static int lastOccurrences(int[] arr, int x) {
		int index = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				index = i;
			}
		}
		return index;
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
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static int[] smallestAndLargestElements(int[] arr) {
		Arrays.sort(arr);
		int[] ans = {arr[0], arr.length-1};
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,7};
		int x = 2;
		
//		System.out.println(countOccurrences(arr, x));
//		System.out.println(lastOccurrences(arr, x));
//		System.out.println(greaterCountOccurrences(arr, x));
//		System.out.println(isSorted(arr));
		
		int[] ans = smallestAndLargestElements(arr);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		
	}
	
	


}
