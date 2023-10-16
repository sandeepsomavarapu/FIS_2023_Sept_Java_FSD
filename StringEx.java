package com.fis.strings;

public class StringEx {

	public static void main(String[] args) {

		// group chars -->String,StringBuffer,StringBuilder-->java.lang

		// String -->immutable
		// StringBuffer,StringBuilder--->mutable
		// String name1=new String("fisglobal");
		// System.out.println(name.concat(" india"));
		// System.out.println(name);

		String name = "fisglobal";// literal
		String name1 = "fisglobal";// literal
		String name2 = "FISGLOBAL";// literal

		System.out.println(name.equals(name1)); // true
		System.out.println(name1.equalsIgnoreCase(name2));// true
		System.out.println(name == name1); // true
		System.out.println(name.compareTo(name1)); // 0
		System.out.println(name1.compareToIgnoreCase(name2));// 0

		String name3 = new String("fisglobal");// literal

		String name4 = new String("fisglobal");// literal

		System.out.println(name3.equals(name4)); // true
		System.out.println(name3.equalsIgnoreCase(name4));// true
		System.out.println(name3 == name4); // false
		System.out.println(name3.compareTo(name4)); // 0
		System.out.println(name3.compareToIgnoreCase(name4));// 0

		System.out.println("a".compareTo("A"));// -1

//		compareTo 
//		--return -ve if obj1 has to come before obj2
//		--return +ve if obj1 has to come after obj2
//		-- return 0 if obj1 & obj2 are equal.

		StringBuffer sb = new StringBuffer("fisglobal");
		StringBuffer sb1 = new StringBuffer("fisglobal");

		sb.append(" hyderabad");
		System.out.println(sb);

	}

}
