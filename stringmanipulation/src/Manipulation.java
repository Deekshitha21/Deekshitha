import java.util.*;
public class Manipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(s1.equals(s2));
		String s3=s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith("h"));
		System.out.println(s1.endsWith("e"));
		System.out.println(s1.charAt(2));
		System.out.println(s1.length());
		System.out.println(s1.replace("e","a"));
		System.out.println(s1.contains("e"));
		System.out.println(s1.trim());

	}

}
