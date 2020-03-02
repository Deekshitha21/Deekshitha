package com.prft.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Viji");
		list.add("Ajay");
		list.add("Arun");
		list.add("Viji");
		list.add("Deepika");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("sorted array:"+list);
		Collections.reverse(list);
		System.out.println("Reverse order:"+list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		list.remove(2);
		System.out.println("for loop");
		// Getting values by for loop
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		list.add(2,"Deekshitha");//adding element in specified index
		list.set(3,"James");//replacing the element 
		//Getting values by list interface
		ListIterator<String> list1=list.listIterator(list.size());
		System.out.println("list itrator");
		while(list1.hasPrevious())
			System.out.println(list1.previous());
		int pos=list.indexOf("Viji");
		System.out.println(list.contains("Deekshitha"));
		System.out.println(pos);
	}

}
