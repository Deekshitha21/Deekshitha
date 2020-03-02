package com.prft.collections;
import java.util.TreeSet;


public class TreeSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(55);
		tree.add(22);
		tree.add(66);
		tree.add(9);
		tree.add(43);
		//tree.add(null);
		System.out.println(tree);
		System.out.println("reverse order:"+tree.descendingSet());
		System.out.println("head set"+tree.headSet(43));
		System.out.println("head set navigatable"+tree.headSet(43, true));
		System.out.println("subset"+tree.subSet(22, 55));
		System.out.println("subset navigatable"+tree.subSet(22,true, 55, true));
		System.out.println("tailset"+tree.tailSet(43));
		System.out.println("tailset navigatable"+tree.tailSet(43, false));
		System.out.println(tree.last()+""+tree.lower(2)+""+tree.size());
		System.out.println("Highest Value: "+tree.pollFirst());  
        System.out.println("Lowest Value: "+tree.pollLast());  
        

	}

}
