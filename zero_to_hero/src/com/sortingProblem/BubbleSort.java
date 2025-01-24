package com.sortingProblem;

public class BubbleSort {
	
	/**
	 * worst case
	 * average case
	 * time complexity o(n2);
	 * space complexity o(1);
	 */
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * best case
	 * time complexity o(n);
	 * space complexity o(1);
	 */
	public static void bubbleSortOptimized(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			boolean flag = false;
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			
			if(!flag) {
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,4,3,1,2};
		bubbleSort(arr);
		for(int ans : arr) {
			System.out.print(ans+" ");
		}
	}

}
