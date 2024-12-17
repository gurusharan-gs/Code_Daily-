package com.string_questions;

public class CharacterFrequency {
	
	public static void main(String[] args) {
		String str = "hello world";
		char target = 'l';
		int count = 0;
		
		for(char c : str.toCharArray()) {
			if(c == target) {
				count++;
			}
		}
		System.out.println(count);
	}

}
