package com.string_questions;

public class FirstNonRepeating {
	
	public static void main(String[] args) {
		
		 String str = "swiss";
		 for(char c : str.toCharArray()) {
			 if(str.indexOf(c) == str.lastIndexOf(c)) {
				 System.out.println(c);
				 break;
			 }
		 }
		
	}

}
