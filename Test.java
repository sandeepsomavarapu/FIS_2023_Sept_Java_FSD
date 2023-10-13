package pack1;

public class Test {
	public void m1() {
		System.out.println("am from m1 method");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.m1();//Same class
	}
}

class Welcome extends Test {
	public void m3() {
		m1();// same package sub class
	}

}

class Hello {
	public void m2() {
		Test test = new Test();
		test.m1();// same package non sub class
	}
}
