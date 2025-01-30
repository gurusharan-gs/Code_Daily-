package com.z_interviewprep;


class MathOperations {
    // Method with two integers
    int add(int a, int b) {
        return a + b;
    }
    
    // Method with three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    

    // Method with two double numbers (Overloaded)
    double add(double a, double b) {
        return a + b;
    }
}



class Animal{
	void makeSound() {
		  System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal{
	@Override
	void makeSound() {
		  System.out.println("Dog barks..");
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		  System.out.println("Cat meows..");
	}
}

public class PolymorphismIn {
	
	public static void main(String[] args) {
		
		MathOperations math = new MathOperations();
        System.out.println("Addition of two numbers: " + math.add(4, 5));
        System.out.println("Addition of three numbers: " + math.add(5, 10, 15));
        System.out.println("Addition of two decimal numbers: " + math.add(5.5, 2.3));
        System.out.println("=======================");
        Dog dog = new Dog();
        dog.makeSound();
        
        Cat cat = new Cat();
        cat.makeSound();
		
	}

}
