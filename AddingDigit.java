import java.util.*;


public class AddingDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rem,value=0,tens=1;
		while(num>0)
		{  
			rem=num%10;
			value=((rem+1)*tens)+value;
			tens=tens*10;
			num=num/10;
		}
		System.out.println(value);
	}

}
