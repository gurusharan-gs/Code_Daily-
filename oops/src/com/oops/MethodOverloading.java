package com.oops;


class Bank{
	public void rateOfInterest() {
		System.out.println("Generall rate of interest 5%");
	}
}

class SBI extends Bank{
	@Override
	public void rateOfInterest() {
		System.out.println("rate of interest for SBI is 6.5%");
	}
}

class HDFC extends Bank{
	@Override
	public void rateOfInterest() {
		System.out.println("rate of interest for HDFC 4.5%");
	}
}



public class MethodOverloading {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.rateOfInterest();
		
		SBI sbi = new SBI();
		sbi.rateOfInterest();
		
		HDFC hdfc = new HDFC();
		hdfc.rateOfInterest();
		
	}

}
