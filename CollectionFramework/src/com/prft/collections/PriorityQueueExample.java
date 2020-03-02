package com.prft.collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <String> que=new PriorityQueue<String>();
		que.add("javascripts");
		que.add("python");
		que.add("angular");
		System.out.println(que);
		System.out.println(que.element());
		System.out.println(que.peek());
		System.out.println(que.poll());
		System.out.println(que.peek());

	}

}
