package com.revision;

public class MyClass {
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void reverse(int[] arr) {
		int i=0, j = arr.length-1;
	    while(i < j) {
	    	swap(arr, i, j);
	    	i++;
	    	j--;
	    }
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		reverse(arr);
		for(int ans : arr) {
			System.out.print(ans+" ");
		}
		
	}

}
