package com.string_questions;

public class LongestWord {
	
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String[] words = str.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest);
    }

}
