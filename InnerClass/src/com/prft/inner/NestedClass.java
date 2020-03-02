package com.prft.inner;
interface People
{
	interface Student
	{
		void stud();
	}
}
class Nested
{
	static int data=20;
	static class State
	{
		static void msg()
		{
			System.out.println(data);
		}
	}
}
public class NestedClass implements People.Student{
	public void stud() {
		System.out.println("nested interface invoked");
	}
	public static void main(String args[]) {
	Nested.State.msg();
	NestedClass obj=new NestedClass();
	obj.stud();
	}
	

}
