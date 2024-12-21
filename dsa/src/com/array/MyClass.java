package com.array;

public class MyClass {
	
	public static boolean isSorted(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void movesZero(int[] arr) {
		int ans = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[ans++] = arr[i];
			}
		}
		while(ans < arr.length) {
			arr[ans++] = 0;
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(isSorted(arr));
		
		
		int[] arr = {0,1,2,0,3,4,5};
		movesZero(arr);
		for(int p : arr) {
			System.out.print(p+" ");
		}
		
		
	}

}
