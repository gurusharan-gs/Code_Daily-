package com.array.day4;

public class ZerosAndOnesOp {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void reverce(int[] arr) {
		int i=0, j = arr.length-1;
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}

	static void zerosAndOnes(int[] arr) {
		int n = arr.length;
		int left = 0, right = n - 1;

		while (left < right) {
			if (arr[left] == 1 && arr[right] == 0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			if (arr[left] == 0) {
				left++;
			}
			if (arr[right] == 1) {
				right--;
			}
		}
	}
	
	

	static void evenAndOdds(int[] arr) {
		int n = arr.length;
		int left = 0, rigth = n - 1;

		while (left < rigth) {
			if (arr[left] % 2 == 1 && arr[rigth] % 2 == 0) {
				swap(arr, left, rigth);
				left++;
				rigth--;
			}
			if(arr[left] % 2 == 0) {
				left++;
			}
			if(arr[rigth] % 2 == 1) {
				rigth--;
			}
		}
	}
	
	static void sortSquare(int[] arr) {
		int n = arr.length;
		int left = 0, right = n-1, k = 0;
		int[] ans = new int[n];
		
		while(left <= right) {
			if(Math.abs(arr[left]) > Math.abs(arr[right])) {
				ans[k++] = arr[left] * arr[left];
				left++;
			}else {
				ans[k++] = arr[right] * arr[right];
				right--;
			}
		}
		reverce(ans);
		for(int i : ans) {
			System.out.print(i+" ");
		}
	}
	

	public static void main(String[] args) {
//		int[] arr = { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 };
//		zerosAndOnes(arr);
		
//		int[] arr = {1,2,3,4,5,6};
//		evenAndOdds(arr);
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
//		int[] arr = {-10,-5,-2,6,8};
//		sortSquare(arr);
		
		int[] arr = {0,1,0,3,12};

		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	}

}
