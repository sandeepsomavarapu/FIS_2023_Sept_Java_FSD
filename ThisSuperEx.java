package com.fis.oops;

import java.util.Date;

class ParentEx {
	int marks = 230;

	public ParentEx() {
		System.out.println("am from default constructor of ParentEx");
	}

	public ParentEx(int result) {
		this();
		System.out.println("am from param constructor of ParentEx");
	}

	public void printDate() {
		Date date = new Date();
		System.out.println("Today's Date is :" + date);
	}

	public void m1() {
		System.out.println("am from parent m1 method");
	}

}

public class ThisSuperEx extends ParentEx {

	int marks = 200;

	public ThisSuperEx() {
		System.out.println("am from default constructor");
	}

	public ThisSuperEx(int marks) {
		super(111);
		System.out.println("am from param constructor" + marks + " : " + this.marks + " " + super.marks);
		this.m1();
		super.m1();
	}

	public void m1() {
		System.out.println("am from child m1 method");
	}

	public static void main(String[] args) {
		ThisSuperEx obj = new ThisSuperEx(123);
	}

}
