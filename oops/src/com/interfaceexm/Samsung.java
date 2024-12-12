package com.interfaceexm;

public class Samsung implements SmartPhone{

	@Override
	public void powerOn() {
		System.out.println("Samsung phone is turning on...");
		
	}

	@Override
	public void makeCalls(String number) {
		System.out.println("Samsung phone calling " + number);
		
	}

	@Override
	public void browsingInternet() {
		 System.out.println("Browsing internet on Samsung using Chrome.");
		
	}

	@Override
	public void takePhotos() {
		System.out.println("Taking a photo with Samsung camera app.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung phone is turning off...");
		
	}

}
