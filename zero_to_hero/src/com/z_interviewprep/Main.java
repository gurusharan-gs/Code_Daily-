package com.z_interviewprep;

class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
	
	@Override
    void show() {
        System.out.println("Class B");
    }
}


class Parent {
    static void show() {
        System.out.println("Parent class static method");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child class static method");
    }
}

public class Main {
	   public static void main(String[] args) {
	        A obj = new B();
	        obj.show();
	        
	        Parent o = new Child();
	        o.show();
	    }
}
