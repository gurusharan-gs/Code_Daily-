package com.revision;

public class BinarySearchInArray {
	
	public static int simpleBinarySearch(int[] arr, int target) {
		
		int start = 0, end = arr.length-1;
		int ans = -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target == arr[mid]) {
				return mid;
			}else if (target < arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int target = 5;
		System.out.println(simpleBinarySearch(arr, target));
	}

}
