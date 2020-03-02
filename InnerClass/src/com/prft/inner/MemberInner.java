package com.prft.inner;
class Outer{
	String name;
//	class Inner{
//		void getName() {
//			name="deekshi";
//		System.out.println(name);
//		}
//	}
	void getName() {
		// TODO Auto-generated method stub
		name="deekshi";
		System.out.println(name);
		
	}
}
public class MemberInner extends Outer {
	@Override
	void getName()
	{
		name="deekshitha";
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Outer ot1=new Outer();
		Outer.Inner in1=ot1.new Inner();
		in1.getName();*/
		MemberInner mi=new MemberInner();
		mi.getName();
		
		

	}

}
