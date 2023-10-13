package pack1;//our class should extends exception,Throwable

//parameterized constructor
class AgeNotValid extends Exception {
	private int age;

	public AgeNotValid(String message) {
		super(message);
	}
}

public class Exception6 {
	static void validation(int age) throws AgeNotValid {
		if (age < 18)
			throw new AgeNotValid("not eligiable to vote");// MyException1 obj
		else
			System.out.println("you are eligable to vote");
	}

	public static void main(String args[]) throws AgeNotValid {
		Exception6.validation(16);
		System.out.println("rest of the code...");
	}
}