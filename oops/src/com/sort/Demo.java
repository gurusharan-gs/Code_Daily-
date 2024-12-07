package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
	
	int id;
	String name;
	String address;
	int marks;
	
	public Student1(int id, String name, String address, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}

}

class SortByName implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.address.compareTo(o2.address);
	}
	
}

public class Demo {
	
	public static void main(String[] args) {
		
		List<Student1> students = new ArrayList<>();
		students.add(new Student1(1, "Sachin", "Mumbai", 900));
		students.add(new Student1(4, "Ajay", "Bangalore", 580));
		students.add(new Student1(2, "Vijay", "Pune", 888));
		students.add(new Student1(3, "Bhuhan", "Dehli", 950));
		students.add(new Student1(7, "Chetan", "Kolkata", 740));
		students.add(new Student1(6, "Ravi", "Agra", 780));
		students.add(new Student1(5, "Irana", "mangalore", 850));
		
		System.out.println(students);
		System.out.println();
		Collections.sort(students, new SortByName());
		System.out.println(students);
		

		
	}

}
