package com.sortingProblem;

public class SelectionSort {
	
	/***
	 * Time Complexity
		Best Case: 
		𝑂(𝑛2)
		O(n2) (even if the array is already sorted, comparisons are still made).
		
		Worst Case: 
		𝑂(𝑛2)
		O(n2) (if the array is sorted in reverse order).
		Average Case: 
		𝑂(𝑛2)
		O(n2).
		Space Complexity
		Space: 
		𝑂(1)
		O(1) (no extra memory is used; sorting is done in place).
			 
	 */
	
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			int min_index = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,4,6,3,2,1};
		selectionSort(arr);
		for(int ans : arr) {
			System.out.print(ans+" ");
		}
	}

}
