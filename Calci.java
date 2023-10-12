package com.fis.oops;

interface Mobile_Calci {
	public abstract void mul(int a, int b);

	void div(int a, int b);// public abstract void div(int a,int b);
}

abstract class Caluculator implements Mobile_Calci {
	public void add(int a, int b) {
		System.out.println("add of two int's : " + (a + b));
	}

	public abstract void sub(int a, int b);
}

public class Calci extends Caluculator {
	public void m1() {
		System.out.println("Am from m1 method");
	}

	public static void main(String[] args) {
		Calci obj = new Calci();
		obj.add(12, 13);
		obj.sub(12, 13);
		obj.mul(2, 3);
		obj.div(12, 3);
	}

	@Override
	public void mul(int a, int b) {

	}

	@Override
	public void div(int a, int b) {

	}

	@Override
	public void sub(int a, int b) {

	}
}