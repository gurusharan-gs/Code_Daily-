package com.interfaceexm;

public class IPhone implements SmartPhone{

	@Override
	public void powerOn() {
		System.out.println("IPhone phone is turning on...");
		
	}

	@Override
	public void makeCalls(String number) {
		System.out.println("IPhone phone calling " + number);
		
	}

	@Override
	public void browsingInternet() {
		System.out.println("Browsing internet on IPhone using Safari.");
		
	}

	@Override
	public void takePhotos() {
		System.out.println("Taking a photo with IPhone camera app.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("IPhone phone is turning off...");
		
	}

}
