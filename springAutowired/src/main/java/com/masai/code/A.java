package com.masai.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class B{
	public void funB() {
		System.out.println("inside funB of B");
		}
}

@Service
public class A {
	
	@Autowired
	private B b;
	
	public void funA() {
		System.out.println("inside funA of A");
		System.out.println(b);
		}

	public static void main(String[] args) {
		
	}

}
