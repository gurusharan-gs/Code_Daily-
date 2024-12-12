package com.interfaceexm;

public class Main {
	
	public static void main(String[] args) {
		
		SmartPhone samsung = new Samsung();
		samsung.powerOn();
		samsung.makeCalls("9595245220");
		samsung.browsingInternet();
		samsung.takePhotos();
		samsung.powerOff();
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println();
		SmartPhone iphone = new IPhone();
		iphone.powerOn();
		iphone.makeCalls("8594156210");
		iphone.browsingInternet();
		iphone.takePhotos();
		iphone.powerOff();
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println();
	}

}
