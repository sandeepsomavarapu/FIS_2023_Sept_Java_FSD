package com.fis.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Employee emp = new Employee(123, "amit", 234000, "developer", "hyderabad");
//
//		FileOutputStream fos = new FileOutputStream("emps.txt");
//
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//		oos.writeObject(emp);
//		System.out.println("employee saved successfully");
		
		
		
		
		FileInputStream fis=new FileInputStream("emps.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Employee emp=(Employee)ois.readObject();
		
		System.out.println(emp);
		
		

	}

}
