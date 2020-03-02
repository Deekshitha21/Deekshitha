package com.prft.inner;
class MainClass{
	void demo()
	{
		final int i=1;
		System.out.println("Demo method invoked");
		class Inner{
			void local()
			{
				System.out.println(i);
			}
		}
			Inner in=new Inner();
			in.local();
		}
	}
	
public class LocalInner {
	public static void main(String args[])
	{
	MainClass obj1=new MainClass();
	obj1.demo();
	}

}
