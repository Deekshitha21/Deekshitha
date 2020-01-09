import java.util.*;
public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num1=sc.nextInt();
		int num2=0;
		try
		{
			try
		{
			System.out.println("try block 1");
			int rem=num1/num2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled by catch block 1");
		}
		try
		{
			int[] number={1,2,3,4};
			System.out.println("try block 2");
			System.out.println(number[10]);
		}
		catch(NullPointerException e)
		{
			System.out.println("Handled by catch block 2");
		}
		}
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("parent block is caught");
		}*/
		finally
		{
			System.out.println("Finally block executed");
		}
	}
}
	
