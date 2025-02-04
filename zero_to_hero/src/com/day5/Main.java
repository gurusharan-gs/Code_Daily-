package com.day5;

public class Main {
	
	static int pivote(int[] arr) {
		int n = arr.length;
		
		int st = 0, end = n-1;
		int ans = -1;
		while(st <= end) {
			int mid = st + (end - st) / 2;
			
			if(arr[mid] < arr[n-1]) {
				ans = mid;
				end = mid - 1;
			}else {
				st = mid + 1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,5,1,2,3};
		System.out.println(pivote(arr));


}
	
}
