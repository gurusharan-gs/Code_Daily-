package com.day1;


class Animal{
	
	public void sound() {
		System.out.println("Animals make sounds");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("Cat meows");
	}
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}

public class Inheritanceqsn {
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
		
		Dog d = new Dog();
		d.sound();
	}

}
