package com.string_questions;

public class ReverseString {
	
	public static void main(String[] args) {
		
		// Approach 1
		String str = "hello";
		System.out.println(str);
		String reverse = new StringBuilder(str).reverse().toString();
		System.out.println(reverse);
		
		// Approach 2
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));	
		}
		
	}

}
