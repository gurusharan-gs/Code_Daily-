package com.basic;

public class MissingNumber {
	
	  /**
	   * if array contain non-zeros values example like 1,2,4,5
	   *  use this formula (n+1) * (n+2) / 2;
	   */
	  public static int findMissingNumber(int[] arr) {
		 int n = arr.length;
		 
		 int expectedSum = (n+1) * (n+2) / 2;
		 
		 int actualSum = 0;
		 for(int ans : arr) {
			 actualSum += ans;
		 }
		 return expectedSum - actualSum;
	  }
	  
	  /**
	   * if array contain zeros example like 1,0,2,4,5
	   * use this formula n * (n+1) / 2;
	   */
	  public static int missingNumber(int[] nums) {
		    int n = nums.length;
		    int expectedSum = n * (n + 1) / 2;
		    int actualSum = 0;
		    for (int num : nums) {
		        actualSum += num;
		    }
		    return expectedSum - actualSum;
		}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,5,6,7};
		System.out.println(findMissingNumber(arr1));
		
		
		int[] arr2 = {5,1,0,3,4};
		System.out.println(missingNumber(arr2));
	}

}
