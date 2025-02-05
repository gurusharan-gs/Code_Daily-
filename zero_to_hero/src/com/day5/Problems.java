package com.day5;

import java.util.HashMap;
import java.util.Map;

public class Problems {

	public static char fWoed(String str) {

		Map<Character, Integer> freMap = new HashMap<>();
		for (char c : str.toCharArray()) {
			freMap.put(c, freMap.getOrDefault(c, 0) + 1);
		}

		char maxChar = 0;
		int maxValue = 0;

		for (Map.Entry<Character, Integer> entry : freMap.entrySet()) {
			if (entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				maxChar = entry.getKey();
			}
		}
		return maxChar;

	}

	public static void main(String[] args) {

		String input = "programming";
		char maxFrequencyChar = fWoed(input);
		System.out.println(maxFrequencyChar);
	}
}