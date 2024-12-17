package com.string_questions;

public class PalindromeInString {
	
	public static void main(String[] args) {
		String str = "madam";
		
		String sb = new StringBuffer(str).reverse().toString();
		System.out.println(str.equalsIgnoreCase(sb));
		
		if(str.equalsIgnoreCase(sb)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
        
        
        
	}

}
