package com.z_interviewprep;

class Vehicle {
    String brand;
    int wheels;

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle{
	  int doors;
	  
	  void showDetails() {
		  System.out.println("Car Brand: " + brand + ", Wheels: " + wheels + ", Doors: " + doors);
	  }
}

public class InheritanceIn {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "BMW";
		car.wheels = 4;
		car.doors = 4;
		car.start();
		car.showDetails();
	}

}
