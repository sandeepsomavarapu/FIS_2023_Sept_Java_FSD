package com.fis.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

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

		HashMap<Integer, String> al = new HashMap<Integer, String>();// 16
		al.put(432, "suresh");// entry
		al.put(222, "sandeep");
		al.put(121, "naresh");
		al.put(900, "rajesh");
		al.put(789, "naresh");
		al.put(213, "satish");
		al.put(432, "kiran");

		System.out.println(al);
		
		
		Set<Entry<Integer,String>> entries=al.entrySet();
		Iterator<Entry<Integer,String>> entry=entries.iterator();
		
		while(entry.hasNext())
		{
		Entry<Integer,String> keyValue=	entry.next();
		//System.out.println(keyValue);
		System.out.println(keyValue.getKey()+"  "+keyValue.getValue());
		}		
		

//		Set<Integer> set = al.keySet();
//
//		Iterator<Integer> keys = set.iterator();
//
//		while (keys.hasNext()) {
//			int key = keys.next();
//			System.out.println(key + " " + al.get(key));
//		}
//		
//		

//		System.out.println(al.get(213));
//		System.out.println(al.remove(789));
//
//		System.out.println(al.containsKey(111));
//		System.out.println(al.containsValue("sandeep"));
//		System.out.println(al);
//		HashMap<Integer, String> al1 = new HashMap<Integer, String>();// 16
//		al1.put(333, "fisglobal");
//		al1.put(444, "fis");
//		al1.putAll(al);
//		System.out.println(al1);

	}
}
