package com.basic;import java.awt.DisplayMode;

public class Palindrome {
	
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
	
	public static void main(String[] args) {
		int x = 121;
		System.out.println(isPalindrome(x));
	}

}
