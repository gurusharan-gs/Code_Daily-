package com.binary_search;

public class OrderAgnosticBS {

	public static int orderAgnosticBS(int[] arr, int target) {
		int n = arr.length;
		int start = 0;
		int end = n - 1;

		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}

	
	public static void main(String[] args) {

//		int[] arr = {1,3,4,5,6,10,15,16,22,38};
		int[] arr = {39,22,16,10,9,5,2,0,-2,-10};
		int target = 16;
		System.out.println(orderAgnosticBS(arr, target));
		
	}

}
