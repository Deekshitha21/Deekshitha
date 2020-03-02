package com.prft.collections;
import Emp.*;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Example> tm=new TreeMap<Integer, Example>();
		//Creating objects for book
		Example b1=new Example();
		b1.Book(1001,400,"Alchemist","Panto Coleho");
		Example b2=new Example();
		b2.Book(1002,540,"Romeo Juliat","William Shakespeare");
		Example b3=new Example();
		b3.Book(1003,760,"Two States","Chetan Bhagat");
		tm.put(3, b1);
		tm.put(1, b2);
		tm.put(2, b3);
		TreeMap<Integer,Example> tm2=new TreeMap<Integer, Example>();
		tm2.putAll(tm);
		Example b4=new Example();
		b4.Book(1004,350,"Java","James");
		tm2.put(4,b4);
		for(Map.Entry<Integer,Example> entry:tm2.entrySet())
		{
			int key=entry.getKey();
			Example b=entry.getValue();
			System.out.println(key+" Details");
			System.out.println(b.id+","+b.name+","+b.author+","+b.pageno);
			
		}
		tm.remove(2);
		System.out.println("After removing:");
		for(Map.Entry<Integer,Example> entry:tm2.entrySet())
		{
			int key=entry.getKey();
			Example b=entry.getValue();
			System.out.println(key+" Details");
			System.out.println(b.id+","+b.name+","+b.author+","+b.pageno);
			
		}


	}


}
