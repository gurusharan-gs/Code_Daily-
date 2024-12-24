package com.binary_search;

public class Demo {
	
	public static boolean binarySearch(int[] arr, int target) {
		int n = arr.length;
		int start = 0, end = n-1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				return true;
			}else if(target < arr[mid]){
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return false;
	}
	
	
	public static int firstOccurrenceBinarySearch(int[] arr, int target) {
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
	
	public static int lastOccurrenceBinarySearch(int[] arr, int target) {
		int n = arr.length;
		int start = 0, end = n-1;
		int ans = -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(arr[mid] == target) {
				ans = mid;
				start = mid + 1;
			}else if (target < arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return ans;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,2,2,3,4,5,6};
		int target = 2;
		System.out.println(binarySearch(arr, target));
		System.out.println(firstOccurrenceBinarySearch(arr, target));
		System.out.println(lastOccurrenceBinarySearch(arr, target));
		
	}

}
