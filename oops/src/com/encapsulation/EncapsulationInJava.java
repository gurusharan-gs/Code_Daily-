package com.encapsulation;

class Student{
	private String name;
	private int age;
	private int marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
}

public class EncapsulationInJava {
	
	public static void main(String[] args) {
		Student std = new Student();
		std.setName("guru");
		std.setAge(23);
		std.setMarks(896);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getMarks());
		System.out.println(std);
				
		
	}

}
