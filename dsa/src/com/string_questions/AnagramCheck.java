package com.string_questions;

import java.util.Arrays;

public class AnagramCheck {
	
	public static void main(String[] args) {
	    String str1 = "listen";
        String str2 = "silent";
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
	}

}