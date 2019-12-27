import java.util.Scanner;

public class TestException {
	int b=0;
void m(int[] num,int count)throws ArithmeticException
{ 
	System.out.println("Execution starts");
	for(int i=0;i<count;i++)
	{
		try{
			int a=num[i]/b;
			throw new ArithmeticException();
		}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
}
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestException obj=new TestException();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int count=sc.nextInt();
		int num[]=new int[count];
		for(int i=0;i<count;i++)
		{
			 num[i]=sc.nextInt();
		}
		obj.m(num,count);

	}

}
