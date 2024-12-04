package com.array;

public class Main {
	
	public static int countOccu(int[] arr, int x) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				count++;
			}
		}
		return count;
	}
	
	public static int findLastOccu(int[] arr, int x) {
		int lastvalue = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				lastvalue = i;
			}
		}
		return lastvalue;
	}
	
	public static int greaterCountOccurrences(int[] arr, int x) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > x) {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2,3,15,2,7,9,5,2};
		int x = 2;
		System.out.println(countOccu(arr, x));
		System.out.println(findLastOccu(arr, x));
		System.out.println(greaterCountOccurrences(arr, x));
	}

}
