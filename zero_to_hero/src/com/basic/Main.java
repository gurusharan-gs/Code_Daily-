package com.basic;

public class Main {
	
	public static boolean isPalindrome(int x) {
		String str = Integer.toString(x);
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) { 
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static int missingNumber(int[] arr) {
		int n = arr.length;
		int exptedSum = n * (n+1) / 2;
		int actulSum = 0;
		for(int ans : arr) {
			actulSum += ans;
		}
		return exptedSum - actulSum;
	}
	
	public static void main(String[] args) {
		int x = 121;
		System.out.println(isPalindrome(x));
		
		int[] arr = {1,0,3,2,5};
		System.out.println(missingNumber(arr));
	}

}
