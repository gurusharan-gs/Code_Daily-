package com.day2;

public class CountEvenOdd {
	
	public static int[] countEvenOdd(int[] arr) {
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		return new int[] {oddCount,evenCount};
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] ans = countEvenOdd(arr);
		for(int res : ans) {
			System.out.print(res+" ");
		}
	}

}
