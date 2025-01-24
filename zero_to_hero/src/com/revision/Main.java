package com.revision;

import com.basic.ZerosAndOnes;

public class Main {
	
	public static int missingNumber(int[] arr) {
		int n = arr.length + 1 ;
		int expectedSum = n * (n+1) / 2;
		int actulSum = 0;
		for(int ans : arr) {
			actulSum += ans;
		}
		return expectedSum - actulSum;
	}
	
	public static void moveZeros(int[] arr) {
		int nonZero = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[nonZero++] = arr[i];
			}
		}
		while(nonZero < arr.length) {
			arr[nonZero++] = 0; 
		}
	}
	
	public static void moveZeros2(int[] arr) {	
		int nonZero = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				if(i != nonZero) {
					int temp = arr[i];
					arr[i] = arr[nonZero];
					arr[nonZero] = temp;
				}
				nonZero++;
			}
		}
	}
	
	public static boolean palinrome(int x) {
		
		String str = Integer.toString(x);
		
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static int removeDuplicates(int[] arr) {
		int ans = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				arr[ans++] = arr[i];
			}
		}
		return ans;
	}
	
	public static void swap(int[] arr, int i, int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
	}
	
	public static void reverse(int[] arr, int i, int j) {
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	public static void rotateArrays(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverse(arr, 0, n-k-1);
		reverse(arr, n-k, n-1);
		reverse(arr, 0, n-1);
	}
	
	public static void zerosAndOnes(int[] arr) { 
		int left = 0, right = arr.length-1;
		
		while(left < right) {
			if(arr[left] == 1 && arr[right] == 0) {
				swap(arr, left, right);
			}
			left++;
			right--;
			
			if(arr[left] == 0) {
				left++;
			}
			if(arr[right] == 1) {
				right--;
			}
		}
	}
	
	public static boolean arrayIsSorted(int[] arr) {
		for(int i=1; i< arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] countEvenAndOdd(int[] arr) {
		int even = 0;
		int odd = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		return new int[] {even, odd};
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int[] ans = countEvenAndOdd(arr);
		for(int i: ans) {
			System.out.print(i+" ");
		}
		
		
//		System.out.println(arrayIsSorted(arr));
		
//		zerosAndOnes(arr);
		
//		int k = 6;
//		rotateArrays(arr, k);
		
//        System.out.println(removeDuplicates(arr));
		
//		int x = 121;
//		if(palinrome(x)) {
//			System.err.println("Yes");
//		}else {
//			System.out.println("No");
//		}
		
//		moveZeros(arr);
//		moveZeros2(arr);
//		for(int i=0; i<arr.length; i++) {
//		  System.out.print(arr[i]+" ");
//		}
//		
//		System.out.println(missingNumber(arr));
	}

}
