package com.fis.oops;

class Mobile_Calci {
	public void mul(int a, int b) {
		System.out.println("mul of two int's : " + (a * b));
	}

	public void div(int a, int b) {
		System.out.println("div of two int's : " + (a / b));
	}
}

class Caluculator extends Mobile_Calci {
	public void add(int a, int b) {
		System.out.println("add of two int's : " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("sub of two int's : " + (a - b));
	}
}

public class Calci extends Mobile_Calci {
	public static void main(String[] args) {
		Calci obj = new Calci();
//		obj.add(12, 13);
//		obj.sub(12, 13);
		obj.mul(2, 3);
		obj.div(12, 3);
	}

}
