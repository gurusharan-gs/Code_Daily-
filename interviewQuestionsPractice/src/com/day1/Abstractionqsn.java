package com.day1;

abstract class Vehicle{
    // Abstract method (no implementation)
    abstract void start();

    // Concrete method (common implementation)
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("Car starts with a key.");
	}
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick.");
    }
}


public class Abstractionqsn {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.start();
		car.stop();
		
		System.out.println();
		
		Bike bike = new Bike();
		bike.start();
		bike.stop();
		
	}

}
