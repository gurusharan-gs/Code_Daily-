package com.array.day3;

public class Main {
	
	static void swap(int a, int b) {
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println();
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	
	
	static void swapWithoutTemp(int a, int b) {
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
	
//		swap(a, b);
		swapWithoutTemp(a, b);
		
	}

}
