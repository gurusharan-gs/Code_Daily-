package com.exceptionHandling;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class ExceptionHandleIn {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;

//		try {
//			int result = a/b;
//			System.out.println("result: "+result);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			
//		}finally {
//			System.out.println("Hello");
//		}

//		try {
//			int[] arr = new int[5];
//			arr[6] = 10;
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}

//		try {
//			int[] arr = new int[5];
//			arr[6] = 10;
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

		int[] arr = new int[5];

//		try {
//			arr[6] = 10 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
		
//		try {
//			arr[6] = 10 / 5;
//		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		} 
		
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age < 18) {
			throw new RuntimeException("You Not Eligible..");
		}else {
			System.out.println("your eligible for vote..");
		}
		

	}

}
