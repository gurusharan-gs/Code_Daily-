package com.array.day5;

public class RangeQuery {
	
	public static int[] prefixSum(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			arr[i] += arr[i-1];
		}
		return arr;
	}
	
	public static void main(String[] args) {
		    int[] arr = {2,1,3,4,5};
		    int n = arr.length;
		    int[] ans = new int[n+1];
		    for(int i=1; i<=ans.length; i++) {
		    	ans[i] = arr[i];
		    }
	
			int[] sum = prefixSum(arr);
			int l = 2;
			int r = 5;
			int result =  sum[r] - sum[l-1];
			System.out.println(result);
			
	}

}
