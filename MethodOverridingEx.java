package com.fis.oops;

 class Parent { //final
	 int age = 22;//final

	public  void m1() {
		System.out.println("am from m1 method of Parent class");
	}

	public  void printAge() {//final
		++age;
		System.out.println("Age is :" + age);
	}
}//final-->before variable,method,class

public class MethodOverridingEx extends Parent {

	public static void main(String[] args) {
		MethodOverridingEx obj = new MethodOverridingEx();
		obj.m1();
		obj.printAge();
	}

	
	public void printAge() {
		--age;
		System.out.println("Age is :" + age);
	}

}
