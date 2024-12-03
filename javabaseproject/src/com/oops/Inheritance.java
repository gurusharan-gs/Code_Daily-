package com.oops;

class Vehicle{
	double price;
	double mileage;
	String color;
	
	public void display() {
		System.out.println("Price: "+price);
		System.out.println("Mileage: "+mileage);
		System.out.println("Color: "+color);
	}
	
}

class Car extends Vehicle{
	String model;
	String fuelType;
	boolean sunroof; 
}

public class Inheritance {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.model = "BMW";
		car1.color = "Red";
		car1.price = 5000000.12;
		car1.mileage = 18.23;
		car1.sunroof = true;
		car1.fuelType = "Petrol";
		car1.display();
		System.out.println(car1.sunroof);
		System.out.println(car1.fuelType);
		System.out.println(car1.model);
		
	}

}
