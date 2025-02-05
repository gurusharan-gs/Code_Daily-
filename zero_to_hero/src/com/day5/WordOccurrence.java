package com.day5;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordOccurrence {
	
	public static void main(String[] args) {
		String text = "hello world hello stream world stream api hello";
        
//		Map<String, Long> wordCount = Stream.of(text.split("\\s+"))
//				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
//		        wordCount.forEach((word, count) -> System.out.println(word+" : "+ count));
//  	
		      
		
		Stream.of(text.split("\\s+"))
		.collect(Collectors.groupingBy(word -> word, Collectors.counting()))
		.forEach((word, count) -> System.out.println(word+" : "+count));
		
		
		
	}  
}
