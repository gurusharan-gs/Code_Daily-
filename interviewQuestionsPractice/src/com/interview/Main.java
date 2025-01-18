package com.interview;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class Main {
	
	public static void main(String[] args) {
		
		Person[] peples = new Person[3];
		peples[0] = new Person("Sagar", 17);
		peples[1] = new Person("Ramesh", 23);
		peples[2] = new Person("Ravi", 26);
		
		for(Person p : peples) {
			System.out.println(p.name +" "+ p.age);
		}
	
	}

}
