import java.util.*;
abstract class Numbers{
	abstract void run(int arr[],int a);
	Numbers()
	{
		System.out.println("the sorted array is");
	}
}
public class Abstraction extends Numbers 
{
	void run(int arr[],int a)
	{
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter the numbers:");
		for(int i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		Abstraction obj=new Abstraction();
		obj.run(num,size);

	}

}
