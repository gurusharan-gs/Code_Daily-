package com.iInheritance;


class Vehicle {
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void startEngine() {
        System.out.println("The engine is starting...");
    }
}

class Car extends Vehicle{
	
  public void drive() {
        System.out.println("The car is driving...");
    }
}

public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.startEngine();
		car.drive();
		car.setName("BMW");
		System.out.println(car.getName());

	}

}
