import java.util.*;
public class OneDimension {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		int l=s1.length();
		char[] ch=s1.toCharArray();
		System.out.println(l);
		char temp;
		for(int i=0;i<l;i++)
		{
			if(ch[i]=='e')
			{
				temp=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=temp;
			}
		}
		System.out.println(ch.toString());
	}

}
