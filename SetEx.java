package com.fis.collections;

import java.util.Comparator;
import java.util.TreeSet;

//1)both similar/disimilar  type homogoeneous/heterogeneous data   allowed 

//2)collections are not fixed in size / growable in nature AIOE
//
//3)lots of utility methods	
//	
//1)duplicates are not allowed
//2)insertion order is not preserved 

public class SetEx {
	public static void main(String[] args) {

		TreeSet<String> al = new TreeSet<String>(new MyOrder());// 16   Comparable -->FI-->SAM-->compareTo-->NSO
		al.add("suresh");
		al.add("sandeep");
		al.add("naresh");
		al.add("rajesh");
		al.add("naresh");
		al.add("satish");
		al.add("kiran");

		System.out.println(al);

	}
}
class MyOrder implements Comparator<String>//compare
{

	@Override
	public int compare(String o1, String o2) {
	//	return -o1.compareTo(o2);
		return o2.compareTo(o1);
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