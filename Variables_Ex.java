package com.fis.basic;

public class Variables_Ex {
	long contact = 9494949494l;// global variable -->instance,static 8 bytes
	static int pincode = 500074; // 4 bytes

	public int addOfTwo(int a, int b) {
		return a + b;
	}

	public static void sayhello() {
		System.out.println("Hello everyone....");
	}

	public int subOfTwo() {
		int a = 123;
		int b = 234;
		return a - b;
	}

	public static void main(String[] args) {
		int marks = 23232;// local variable

		Variables_Ex obj = new Variables_Ex();

		System.out.println(Variables_Ex.pincode);
		System.out.println(obj.contact);
		System.out.println(marks);

		Variables_Ex.sayhello();
		System.out.println(obj.addOfTwo(12, 14));
		System.out.println(obj.subOfTwo());
	}

}
