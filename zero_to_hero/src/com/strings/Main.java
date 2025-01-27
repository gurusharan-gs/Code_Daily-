package com.strings;

 
abstract class payment{
	abstract public void pay();
}

class creditCard extends payment{

	@Override
	public void pay() {
		System.out.println("creditCard pay bill");
	}
}

class paypal extends payment{

	@Override
	public void pay() {
		System.out.println("paypal pay bill");	
	}	
}

class upi extends payment{

	@Override
	public void pay() {
		System.out.println("upi pay bill");	
	}	
}

public class Main {
	
	public static void main(String[] args) {
		
		creditCard card = new creditCard();
		card.pay();
		
		paypal p = new paypal();
		p.pay();
		
		upi u = new upi();
		u.pay();
	}
	

}
