package com.practices;

public class StringQueations {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		String  substring = "hello";
		
		if(str.toLowerCase().contains(substring)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
