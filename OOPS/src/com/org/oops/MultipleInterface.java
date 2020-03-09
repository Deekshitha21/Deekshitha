import java.util.*;
interface Sorting
{
	void sort(String[] s);
}
interface length extends Sorting
{
	void display();
}
public class MultipleInterface implements length
{
	public void display()
	{
		System.out.println("the sorted string is:");
	}
	public void sort(String[] s)
	{
		Arrays.sort(s);
		//ghSystem.out.println(Arrays.toString(s));
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the letters");
		String s1=sc.nextLine();
		System.out.println("value of s1:"+s1);
		String[] s2=s1.split("");
		MultipleInterface obj=new MultipleInterface();
		obj.display();
		obj.sort(s2);

	}

}

