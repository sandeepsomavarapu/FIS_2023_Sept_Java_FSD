package pack2;

import pack1.Test;

public class Client {
	public static void main(String[] args) {
		Test test = new Test();
		test.m1(); // different package non-sub class
	}
}

class Test_Class extends Test {

	public void testMethod() {
		m1();// different package sub class
	}
}