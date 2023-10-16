package com.fis.strings;

public class ArraysEx {

	public static void main(String[] args) {

		int array[] = new int[10];
		int[] array1 = { 22, 32, 12, 53, 642, 33, 86, 90 };

//		for (int i = 0; i < array1.length; i++) {
//			System.out.println(array1[i]);
//		}

//		for (int a : array1) {
//			System.out.println(a);
//		}
//
//		int result[][] = new int[3][3];
//
//		result[0][0] = 12;

		int result1[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };

		for (int i = 0; i < result1.length; i++) {

			for (int j = 0; j < result1.length; j++) {
				System.out.print(result1[i][j]+" ");//1
			}
			System.out.println();
		}

	}

}
