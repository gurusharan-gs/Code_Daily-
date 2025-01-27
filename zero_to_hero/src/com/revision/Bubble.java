package com.revision;

public class Bubble {
	
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
	
	public static void main(String[] args) {
		int[] arr = {5,4,6,3,2,1};
		bubbleSort(arr);
		for(int ans : arr) {
			System.out.print(ans+" ");
		}
	}

}
