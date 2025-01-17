package com.day3;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int target) {
		int start = 0, end = arr.length-1;
		int ans = -1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(target == arr[mid]) {
				ans = mid;
				end = mid - 1;
			}else if(target < arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,2,3,4,5,6,7};
		int target = 1;
		System.out.println(binarySearch(arr, target));
	}

}
