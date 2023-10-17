package com.fis.java8;

@FunctionalInterface
interface Calculator {
	public abstract int add(int a, int b);

	public default void m1() {

	}

	public static void m2() {

	}
}

public class LamdaTest {
	public static void main(String[] args) {
		Calculator calci = (a, b) -> (a + b);
		System.out.println(calci.add(12, 12));
		System.out.println(calci.add(13, 22));
		
		LamdaTest obj=new LamdaTest();
		
		Calculator calci1 =obj::m1; 
		Calculator calci2 =LamdaTest::m2; 
		
	}

	public int m1(int a, int b) {
		return a + b;
	}
	
	public static int m2(int a, int b) {
		return a + b;
	}

}
