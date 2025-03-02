package com.revision;

public class Demo {
	
	public static void bubbleSort(int[] arr) {
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
	
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i=1; i<n; i++) {
			int j = i;
			
			while(j > 0 && arr[j] < arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,1,2,3,4,6,7,8};
//		bubbleSort(arr);
//		selectionSort(arr);
		insertionSort(arr);
		
		
		
		for(int ans : arr) {
			System.out.print(ans+" ");
		}
		
	}

}
