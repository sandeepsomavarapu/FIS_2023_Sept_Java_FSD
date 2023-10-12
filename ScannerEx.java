package com.fis.basic;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee id:");
		int eid = scanner.nextInt();
		System.out.println("Enter Employee Name:");
		String ename = scanner.next();
		System.out.println("Enter Employee Salary");
		float salary = scanner.nextFloat();

		System.out.println(eid + " " + ename + " " + salary);
		scanner.close();
	}
}
