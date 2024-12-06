package com.inheritance;

class A {
	void methodA() {
		System.out.println("method A");
	}
}

class B extends A{
	void methodB() {
		System.out.println("method B");
	}
}

class C extends B{
	void methodC() {
		System.out.println("method C");
	}
}


public class Main {
	
	public static void main(String[] args) {
		
		B obj = new B();
		obj.methodB();
		obj.methodA();
		
		
		C obj1 = new C();
		obj1.methodB();
		obj1.methodA();
		obj1.methodC();
		
	}

}
