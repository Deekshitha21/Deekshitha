
public class StaticMethod {
	static{System.out.println("static invoke");}
	int a;
	static int b=0;
	void display()
	{
		System.out.println(a+" "+b);
		a++;
		b++;
	}
	static void print()
	{
		System.out.println("java point");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod obj=new StaticMethod();
		StaticMethod obj2=new StaticMethod();
		StaticMethod obj3=new StaticMethod();
		obj.display();
		obj2.display();
		obj3.display();
		StaticMethod.print();
		

	}

}
