package com.core;

class Claculator{
	// 1
	public static int sum(int a, int b) {
		System.out.println("method 1 is calling a + b");
		return a+b;
	}
	
	// 2
	public static int sum(int a, int b, int c) {
		System.out.println("method 2 is calling a + b + c");
		return a+b+c;
	}
	
	// 3
	public static double sum(double a, double b) {
		System.out.println("method 3 is calling a + b");
		return a+b;
	}
	
	
}

public class Demo extends Claculator {
	
	/**
	 * polymorphism in java means many form it allows objects
	 * to behave differently based on the context 
	 * there are two types 
	 * 1 compile time polymorphism ( also known as method overloading )
	 * 2 runtime polymorphism ( also known as method overriding )
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
        
//		System.out.println(sum(1, 2, 3));
		
		Dog dog = new Dog();
		dog.sound();
				
		
		
	}

}

class Animal{
	
	public void sound() {
		System.out.println("Animal make sounds..");
	}
}

class Dog extends Animal{
	
	@Override
	public void sound() {
		
		System.out.println("Dog is making sound..");
	}
}


