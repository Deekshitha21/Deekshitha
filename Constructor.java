import java.util.Scanner;


public class Constructor {
int i;
Constructor()
{
	System.out.println("Sum of the digits");
}
Constructor(int num)
{
	i=num;
	int sum=0,rem;
	while(i>0)
	{
		rem=i%10;
		sum=sum+rem;
		i=i/10;
	}
	System.out.println(sum);
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int number=sc.nextInt();
		Constructor c1=new Constructor();
		Constructor c2=new Constructor(number);
	}

}
