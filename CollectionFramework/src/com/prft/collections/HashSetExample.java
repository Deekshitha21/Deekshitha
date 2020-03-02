package com.prft.collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class HashSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set1=new HashSet<String>();
		LinkedHashSet<String> list1=new LinkedHashSet<String>();
		set1.add("January");
		set1.add("February");
		set1.add("March");
		set1.add("January");
		set1.add(null);
		set1.add(null);
		Iterator<String> itr=set1.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		ArrayList<String> set2=new ArrayList<String>();
		set2.add("500");
		set2.add("255");
		set2.add("500");
		set2.addAll(set1);
		System.out.println(set2);
		set1.addAll(set2);
		System.out.println(set1);
		list1.addAll(set2);
		//Linked HashSet
		System.out.println(list1);
		
	}

}
