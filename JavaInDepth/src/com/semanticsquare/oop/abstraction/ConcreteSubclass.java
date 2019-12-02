package com.semanticsquare.oop.abstraction;

public class ConcreteSubclass extends AbstractSubclass {

	@Override
	void test3() {
		// TODO Auto-generated method stub
		System.out.println("test3");
		
	}

	@Override
	void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
	}

	public static void main(String args[]) {
		ConcreteSubclass concrete = new ConcreteSubclass();
		concrete.test1();
		concrete.test2();
		concrete.test3();
	}
}
