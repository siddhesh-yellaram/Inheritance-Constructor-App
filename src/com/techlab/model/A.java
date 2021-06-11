package com.techlab.model;

public class A {
//	public A() {
//		System.out.println("Inside A Class");
//	}
	
	private int foo;
	
	public A(int foo) {
		this.foo = foo;
		System.out.println("Inside A Class "+ foo);
	}
	
	public int getFoo() {
		return foo;
	}
}
