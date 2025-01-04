package com.day1;

abstract class Payment{
	
	abstract void pay(double amount);
}

class CreditCard extends Payment{

	@Override
	void pay(double amount) {
		System.out.println("Paid $" + amount + " using Credit Card.");
	}
}

class PayPal extends Payment{

	@Override
	void pay(double amount) {
		  System.out.println("Paid $" + amount + " using PayPal.");
	}
}

class UPI extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI.");
    }
}



public class Polymorphismqsn {
	
	public static void main(String[] args) {
		
		CreditCard creditCard = new CreditCard();
//		creditCard.pay(20.00);
		
		PayPal payPal = new PayPal();
//		payPal.pay(50.5);
		
		UPI upi = new UPI();
		upi.pay(40.6);
		
		 
		
	}

}
