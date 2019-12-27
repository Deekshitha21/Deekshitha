import java.util.Scanner;


public class Overloading {
	int salary;
	long grosspay;
	float pf;
	String name;
	void employee(int sal,long gross,float s)
	{
		salary=sal;
		grosspay=gross;
		pf=s;
	}
	 void employee(String s)
	{
		name=s;
		double total=salary+grosspay+pf;
		System.out.println("the employee name is:"+name);
		System.out.println("salary= "+total);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Overloading obj=new Overloading();
		System.out.println("enter the details:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		obj.employee(a,b,c);
		obj.employee(name);
		

	}

}
