package com.day5;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyCharacter {
	
	public static char getMaxFrequencyCharacter(String str) {
		
		Map<Character, Integer> frequencyMap  = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);	
		}
 
		
	      char maxChar = ' ';
	      int maxFrequency = 0;
	      
	      for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
	    	  if(entry.getValue() > maxFrequency) {
	    		  maxFrequency = entry.getValue();
	    		  maxChar = entry.getKey();
	    	  }
	      }
	      return maxChar;	
	}
	
	public static void main(String[] args) {
		
		String input = "programming";
		char maxFrequencyChar = getMaxFrequencyCharacter(input);
		System.out.println(maxFrequencyChar);
	}

}
