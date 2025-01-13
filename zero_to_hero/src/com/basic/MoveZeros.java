package com.basic;

public class MoveZeros {
	
	public static void pushZerosToEnd(int[] arr) {
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                
                if(i != ans){
                    int temp = arr[ans];
                    arr[ans] = arr[i];
                    arr[i] = temp;
                }
                ans++;
            }
        }
  
    }
	
	public static void movesZerosEnd(int[] arr) {
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
	
	public static void main(String[] args) {
		int[] arr = {0,1,0,2,3};
		movesZerosEnd(arr);
//		pushZerosToEnd(arr);
		for(int ans : arr) {
			System.out.print(ans+" ");
		}
	}

}
