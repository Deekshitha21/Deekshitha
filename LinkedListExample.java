import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First List
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("April");//Adding elements
		list1.add("Deekshitha");
		list1.add("May");
		System.out.println(list1);
		list1.add(1,"Harish");//Adding elements in the specified index
		System.out.println("list1: "+list1);
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
		System.out.println(list1.get(2));
		//Second List
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("April");
		list2.add("May");
		list2.add("January");
		System.out.println("list2: "+list2);
		list1.addAll(list2);
		System.out.println(list1);
		list1.addAll(2,list2);
		System.out.println(list1);
		list1.addFirst("August");
		list1.addLast("November");
		System.out.println(list1);
		System.out.println(list1.indexOf("May"));
		System.out.println(list1.lastIndexOf("May"));
		System.out.println(list1.subList(2, 4));
		Iterator it = list1.descendingIterator();
	    System.out.println("Elements in Reverse Order:");
	    while (it.hasNext())
	        System.out.println(it.next());
		list1.removeFirstOccurrence("April");
		list1.removeLastOccurrence("May");
		System.out.println(list1);
		list1.removeFirst();
		list1.removeLast();
		System.out.println(list1);
		list1.removeAll(list2);
		System.out.println(list1);
		
		
		
		

	}

}
