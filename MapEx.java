package com.fis.collections;

import java.util.TreeMap;

//1)both similar/disimilar  type homogoeneous/heterogeneous data   allowed 

//2)collections are not fixed in size / growable in nature AIOE
//
//3)lots of utility methods	
//	
//1)duplicates are not allowed
//2)insertion order is not preserved 

//3)the data must be in key,value pair 
//4)key must be unique value can be duplicate
public class MapEx {
	public static void main(String[] args) {

		TreeMap<Integer, String> al = new TreeMap<Integer, String>();// 16
		al.put(432, "suresh");//entry
		al.put(222, "sandeep");
		al.put(121, "naresh");
		al.put(900, "rajesh");
		al.put(789, "naresh");
		al.put(213, "satish");
		al.put(432, "kiran");

		System.out.println(al);

	}
}
