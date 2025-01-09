package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;import java.util.prefs.PreferenceChangeEvent;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(23);
		numbers.add(2);
		numbers.add(8);
		numbers.add(1);
		
		System.out.println(numbers);
//		
//		List<Integer> evenNumber = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
//		System.out.println(evenNumber);
//		List<Integer> oddNumber = numbers.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
//		System.out.println(oddNumber);
//		
//		Collections.sort(numbers);
//		System.out.println(numbers);
//		
//		List<Integer> sortedNumbers = numbers.stream().sorted().toList();
//		System.out.println(sortedNumbers);
		
		
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("sagar", 17));
		persons.add(new Person("ravi", 26));
		persons.add(new Person("daya", 25));
		persons.add(new Person("umesh", 23));
		persons.add(new Person("ramesh", 24));
		
		// Sorting by age
		List<Person> personsByAge = persons.stream().sorted((p1,p2) -> Integer.compare(p1.age, p2.age)).collect(Collectors.toList());
		System.out.println(personsByAge);
		
		// Sorting by name
		List<Person> personsByName = persons.stream().sorted((p1, p2) -> p1.name.compareTo(p2.name)).toList();
		System.out.println(personsByName);
		
		
		List<Person> pt = persons.stream().filter(p -> p.age <= 24).toList();
		System.out.println(pt);
		
	}

}
