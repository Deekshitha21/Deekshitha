import java.util.*;
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
int n=sc.nextInt();
int rem,a=0,temp;
temp=n;
System.out.println("ente a word");
char ch=sc.next().charAt(0);
while(temp>0)
{
	rem=temp%10;
	a=a+(rem*rem*rem);
	temp=temp/10;
}
if(n==a)
	System.out.println("The number "+n+" is Amstrong number");
else
	System.out.println("The number "+n+" is not Amstrong number");
switch(ch)
{
case 'a': System.out.println("vowel");
break;
default : System.out.println("not vowel");
}
	
	}
	

}
