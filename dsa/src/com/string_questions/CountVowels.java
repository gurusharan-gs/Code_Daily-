package com.string_questions;

public class CountVowels {
	
	public static void main(String[] args) {
		
        String str = "hello world";
        int count = 0;
        for(char c : str.toLowerCase().toCharArray()) {
        	if("aeiou".indexOf(c) != -1) {
        		count++;
        	}
        }
		
		System.out.println(count);
		
	}

}
