package com.revision;

public class BinarySearchI {
	
	public static int binarySearch(int[] arr, int target) {
		
		int n = arr.length;
		int st = 0, end = n-1;
		int ans = -1;
		
		while(st <= end) {
			int mid = st + (end - st) / 2;
			if(arr[mid] == target) {
				ans = mid;
				end = mid - 1;
			}else if(target < arr[mid]) {
				end = mid - 1;
			}else {
				st = mid + 1;
			}
		}
		return ans;
		
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,5,6};
		int target = 5;
		System.out.println(binarySearch(arr, target));
		
	}

}
