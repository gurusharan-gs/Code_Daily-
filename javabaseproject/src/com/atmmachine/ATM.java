package com.atmmachine;


import java.util.Scanner;

public class ATM {
	
	double balance;
	int PIN = 1432;
	
	public void cheackpin() {
		System.out.println("Enter your pin: ");
		Scanner sc = new Scanner(System.in);
		int enterpin = sc.nextInt();
		
		if(enterpin == PIN) {
			menu();
		}else {
			System.out.println("Enter a valid PIN");
		}
	}
	
	public void menu() {
		System.out.println("Enter your choice: ");
		System.out.println("1. Cheak A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposite Money");
		System.out.println("4. EXIT");
		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		if(opt == 1) {
			cheakBalance();
		}else if(opt == 2) {
			withdrowMoney();
		}else if(opt == 3) {
			depositeMoney();
		}else if(opt == 4) {
			return;
		}else {
			System.out.println("Enter a valid choice");
		}
	}
	
	public void cheakBalance() {
		System.out.println("Balance: "+ balance);
		menu();
	}
	
	public void withdrowMoney() {
		System.out.println("Enter Amount to Withdraw:");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		if(amount > balance) {
			System.out.println("Insufficent Balance");
		}else {
			balance = balance - amount;
			System.out.println("Money Withdrawl Successfully");
		}
		menu();
	}
	
	public void depositeMoney() {
		System.out.println("Enter the Amount: ");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		balance = balance + amount;
		System.out.println("Money Deposite Successfully");
		menu();
	}

}

