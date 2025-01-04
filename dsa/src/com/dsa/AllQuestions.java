package com.dsa;

public class AllQuestions {
	
	public static int findOccurence(int[] arr, int x) {
		int ans = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				ans = i;
			}
		}
		return ans;
	}
	
	public static int findUniqeValue(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				return arr[i];
			}
		}
	     return -1;
	}

	public static void reverce(int[] arr, int left, int right) {
//		int left = 0, right = arr.length-1;
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
	
	static void rotateArrayInPlace(int[] arr, int k) {
		int n = arr.length;
		k = k%n;
		reverce(arr, 0, n-k-1);
		reverce(arr, n-k, n-1);
		reverce(arr, 0, n-1);
	}
	
	public static void movesZeros(int[] arr) {
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while(count < arr.length) {
			arr[count++] = 0;
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void zeroAndone(int[] arr) {
		int left = 0, right = arr.length-1;
		
		while(left < right) {
			if(arr[left] == 1 && arr[right] == 0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			
			if(arr[left] == 0) {
				left++;
			}
			if(arr[right] == 1) {
				right--;
			}
		}
	}
	
	public static boolean isSorted(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {6,2,3,4,5};
		
		System.out.println(isSorted(arr));
		
		
		
//		zeroAndone(arr);
//		for(int ans : arr) {
//		System.out.print(ans+" ");
//	}
		
		
			
//		movesZeros(arr);
		
		
//		int x = 4;
//		System.out.println(findOccurence(arr, x));
//		System.out.println(findUniqeValue(arr));
		
//		reverce(arr, 0, arr.length-1);
//		for(int ans : arr) {
//			System.out.print(ans+" ");
//		}
		
//		rotateArrayInPlace(arr, x);
//			for(int ans : arr) {
//			System.out.print(ans+" ");
//		}
		
		
		
		
		
	}

}
