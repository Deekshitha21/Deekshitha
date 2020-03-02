package com.prft.collections;
import java.util.HashMap;
import java.util.Map;
import Emp.*;
public class HashMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Example> hm=new HashMap<Integer, Example>();
		//Creating objects for book
		Example b1=new Example();
		b1.Book(1001,400,"Alchemist","Panto Coleho");
		Example b2=new Example();
		b2.Book(1002,540,"Romeo Juliat","William Shakespeare");
		Example b3=new Example();
		b3.Book(1003,760,"Two States","Chetan Bhagat");
		hm.put(1, b1);
		hm.put(2, b2);
		hm.put(3, b3);
		HashMap<Integer,Example> hm2=new HashMap<Integer, Example>();
		hm2.putAll(hm);
		Example b4=new Example();
		b4.Book(1004,350,"Java","James");
		hm2.put(4,b4);
		for(Map.Entry<Integer,Example> entry:hm2.entrySet())
		{
			int key=entry.getKey();
			Example b=entry.getValue();
			System.out.println(key+" Details");
			System.out.println(b.id+","+b.name+","+b.author+","+b.pageno);
			
		}
		hm.remove(2);
		System.out.println("After removing:");
		for(Map.Entry<Integer,Example> entry:hm2.entrySet())
		{
			int key=entry.getKey();
			Example b=entry.getValue();
			System.out.println(key+" Details");
			System.out.println(b.id+","+b.name+","+b.author+","+b.pageno);
			
		}


	}

}
