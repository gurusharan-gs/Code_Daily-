package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class Student implements Comparable<Student>{
//	
//	Integer id;
//	String name;
//	String address;
//	Integer marks;
//	
//	public Student(Integer id, String name, String address, Integer marks) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.address = address;
//		this.marks = marks;
//	}
//	
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
//	}
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
////		return this.id - o.id; // sort based on id
////		return this.name.compareTo(o.name); // sort based on name
////		return this.address.compareTo(o.address); // sort based on address
//		return this.marks - o.marks; // sort based on marks
//	}
//}


class Student{
	
	Integer id;
	String name;
	String address;
	Integer marks;
	
	public Student(Integer id, String name, String address, Integer marks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}

}

class idComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id - o2.id;
	}
}

class nameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

class addressComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.address.compareTo(o2.address);
	}
}

class marksComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.marks - o2.marks;
	}
}

public class Main {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(11, "Sagar", "Shahapur", 789));
		students.add(new Student(1, "Sachin", "Dehli", 700));
		students.add(new Student(15, "Ramesh", "Pune", 555));
		students.add(new Student(10, "Umesh", "Patana", 894));
		students.add(new Student(8, "Ravi", "Bangalore", 777));
		students.add(new Student(2, "Guru", "Jidaga", 999));
		students.add(new Student(5, "Sharan", "Gulbaraga", 985));
		
		// we sorting student object using implements Comparable method...
//		System.out.println(students); // before sort print
//		System.out.println(); // to create line
//		Collections.sort(students); // we sorting student object using Comparable method
//		System.out.println(students); // after sort print
		
		
		// sort throw id
		System.out.println(students);
		System.out.println();
		Collections.sort(students, new idComparator());
		System.out.println(students);
		
		// sort throw name
//		System.out.println(students);
//		System.out.println();
//		Collections.sort(students, new nameComparator());
//		System.out.println(students);
		
		// sort throw address
//		System.out.println(students);
//		System.out.println();
//		Collections.sort(students, new addressComparator());
//		System.out.println(students);
		
		// sort throw marks
//		System.out.println(students);
//		System.out.println();
//		Collections.sort(students, new marksComparator());
//		System.out.println(students);
		
		

		
		
		
	}

}
