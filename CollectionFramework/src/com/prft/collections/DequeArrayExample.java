package com.prft.collections;
import java.util.ArrayDeque;
import java.util.Deque;


public class DequeArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> q1=new ArrayDeque<Integer>();
		q1.add(45);
		q1.add(99);
		q1.addFirst(45);
		q1.addLast(2);
		q1.offerFirst(11);
		q1.offerLast(4);
		System.out.println(q1);
		q1.pollFirst();
		System.out.println(q1);
		q1.pollLast();
		System.out.println(q1);
		q1.removeFirst();
		System.out.println(q1);
		q1.removeLast();
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1.peekLast());
		System.out.println(q1.poll());
		System.out.println(q1.element());
		System.out.println(q1);
		System.out.println(q1.pollLast());

	}

}
