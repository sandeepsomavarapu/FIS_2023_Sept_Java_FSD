package com.fis.collections;

//1)both similar/disimilar  type homogoeneous/heterogeneous data   allowed 

//
//2)collections are not fixed in size / growable in nature AIOE
//
//3)lots of utility methods	
//	
//1)duplicates are allowed
//2)insertion order is preserved 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListEx {
	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<String>();// 10,16 (cc*3/2)+1
		al.add("suresh");
		al.add("sandeep");
		al.add("naresh");
		al.add("rajesh");
		al.add("naresh");
		al.add("satish");
		al.add("kiran");
		System.out.println(al);
		al.add(2,"fis");
		System.out.println(al);
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("nihasvi");
		al1.add("somesh");
		al1.add("amit");
		System.out.println(al1);
		al1.addAll(al);
		//al1.remove("amit");
		System.out.println(al1.contains("few are started sleeping"));
		System.out.println(al1.containsAll(al));
		System.out.println(al1.isEmpty());
		//al1.removeAll(al1);
		//al1.retainAll(al);
		//al1.clear();
		System.out.println(al1);
		
		
		Iterator<String> itr=al1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	
		

	}
}

//ArrayList al = new ArrayList();//10,16  (cc*3/2)+1
//al.add("suresh");
//al.add(1234);
//al.add(33.5f);
//al.add(true);
//al.add("naresh");
//al.add("rajesh");
//al.add(1234);
//
//System.out.println(al);