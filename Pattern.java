import java.util.*;
public class Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a numberr");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			for (int j=num-i;j>1;j--)
			{ 
				System.out.print(" "); 
			}
			for(int k=0;k<=i;k++ )
			{
				System.out.print("* "); 
			}
		System.out.println();
		}


	}

}
