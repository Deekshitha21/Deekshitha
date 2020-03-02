package com.prft.inner;
abstract class Sample
{
	abstract void msg();
}

public class AnonymousClass {
	public static void main(String[] args) {
		Sample mi=new Sample() {
			void msg() {
			System.out.println("hello");	
			}
		};
		mi.msg();
		
		

	}


}
