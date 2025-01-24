package com.day4;

public class Main {
	
	public static int sqrt(int x) {
		int st = 0, end = x;
		int ans = -1;
		
		while(st <= end) {
			int mid = st + (end - st) / 2;
//			int val = mid * mid;
			long val = (long) mid * mid;
			
			if(val == x) {
				return mid;
			}else if(val < x) {
				ans = mid;
				st = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		int x = 16;
		System.out.println(sqrt(x));
		
		int a = 122;
		System.out.println(isPalindrome(a));
	}
	
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
}
