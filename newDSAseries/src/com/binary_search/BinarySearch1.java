package com.binary_search;

public class BinarySearch1 {
	
	public static int firstOccurenceBinarySearch(int[] arr, int target) {
		int n = arr.length;
		int start = 0, end = n-1;
		int ans = -1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				ans = mid;
				end = mid-1;
			}else if(target < arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return ans;
	}
	
	public static int lastOccurenceBinarySearch(int[] arr, int target) {
		int n = arr.length;
		int start = 0, end = n-1; 
		int ans = -1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				ans = mid;
				start = mid + 1;
			}else if(target < arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,5,5,5,6,7};
		int target = 5;
		System.out.println("first Occurence: "+firstOccurenceBinarySearch(arr, target));
		System.out.println("last Occurence: "+lastOccurenceBinarySearch(arr, target));
	}

}
