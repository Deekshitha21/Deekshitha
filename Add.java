import java.util.*;
public class Add {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rem,rem1,carry=0,temp=0,temp1=0,duplicate=0,count=0;
		while(num>0)
		{
			rem=num%10;
			rem=rem+1+carry;
			count++;
			if(rem==10)
			{
				carry=1;
				rem=0;
				if(count==1)
				duplicate=1;
				
				
			}
			else
				carry=0;
			temp=(temp*10)+rem;
			num=num/10;
		}
		while(temp>0)
		{
			rem1=temp%10;
			temp1=(temp1*10)+rem1;
			temp=temp/10;
			
		}
		if(duplicate==1)
				System.out.println(temp1+"0");
		else
			System.out.println(temp1);
		
		
		

	}

}
