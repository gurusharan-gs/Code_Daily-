package com.array2d;

public class SumoF2dArray {

	static void sumoF2dArrays(int[][] a, int[][] b) {
		int n1 = a.length;
		int n2 = b.length;
		int[][] sum = new int[n1][n2];

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

	}



	public static void main(String[] args) {
		int[][] a = { 
					{ 1, 2, 3 }, 
					{ 5, 6, 3 },
					{ 2, 4, 5 } 
				};
		
		int[][] b = { 
					{ 5, 6, 3 }, 
					{ 7, 8, 2 }, 
					{ 1, 2, 3 }
					
				};

		sumoF2dArrays(a, b);
		
	}

}
