import java.util.Scanner;

class Employee{
	int emp_id;
	String name;
	String state="Tamilnadu";
	void print()
	{
		System.out.println("Employee grosspay");
	}
}
class Salary extends Employee{
	int sal;
	float gross_sal;
	void print1(int emp_id,int sal)
	{
		this.emp_id=emp_id;
		this.name=name;
		this.sal=sal;
		float da=sal*15/100;
		float hra=sal*10/100;
		gross_sal=sal+da+hra;
		System.out.println("The gross salary is:"+gross_sal);
	}
}
class Bonus extends Salary{
	String state="Andhra";
	void display()
	{
		if(gross_sal<10000)
		System.out.println(super.state);
		else 
			System.out.println(state);
	}
}
public class Employees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id,basic salary:");
		int emp_id=sc.nextInt();
		int sal=sc.nextInt();
		Bonus obj=new Bonus();
		obj.print();
		obj.print1(emp_id,sal);
		obj.display();


	}

}
