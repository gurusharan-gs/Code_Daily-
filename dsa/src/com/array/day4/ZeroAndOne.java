package com.array.day4;

public class ZeroAndOne {
	
	static void zerosAndOnes(int[] arr) {
		int n = arr.length;
		int zero = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) {
				zero++;
			}
		}
		for(int i=0; i<n; i++) {
			if(i<zero) {
				arr[i] = 0;
			}else {
				arr[i] = 1;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,1,0,1,0,1,0,1,0};
		zerosAndOnes(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
