package com.basic;

public class MissingNumber {
	
	  public static int findMissingNumber(int[] arr) {
		 int n = arr.length;
		 
		 int expectedSum = (n+1) * (n+2) / 2;
		 
		 int actualSum = 0;
		 for(int ans : arr) {
			 actualSum += ans;
		 }
		 return expectedSum - actualSum;
	  }
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,7};
		System.out.println(findMissingNumber(arr));
	}

}
