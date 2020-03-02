package com.prft.MultiThreading;
//import mainfunction.*;
public class JoinMethod extends Thread {
	public void run()
	{
		System.out.println("thread name:"+Thread.currentThread().getName());
		System.out.println("thread priority:"+Thread.currentThread().getPriority());
	}
	public static void main(String args[])
	{
	/*MultiThread m1=new MultiThread();
	MultiThread m2=new MultiThread();
	MultiThread m3=new MultiThread();
	m1.start();
	try
	{
		m1.join(1500);
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	//m1.start();//throws IllegalThreadStateException
	m2.start();
	m3.start();*/
		JoinMethod j1=new JoinMethod();
		JoinMethod j2=new JoinMethod();
		j1.setPriority(Thread.MAX_PRIORITY);
		j2.setPriority(Thread.MIN_PRIORITY);
		j1.start();
		j2.start();
		

}
}
