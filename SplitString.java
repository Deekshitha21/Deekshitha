import java.util.Scanner;


public class SplitString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s1=sc.nextLine(); 
		String[] s2=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
		
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i].substring(0,3));
		}
		
	}

}
