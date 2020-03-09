package lambda;
interface Draw
{
	public void draw();
}
interface Square
{
	public int square(int a,int b);
}


public class LambdaExpression {
	public static void main(String args[])
	{
		Draw d1=()->{
			System.out.println("Drawable exists");
		};
		Square d2=(a,b)->{
			return (a*b);
		};
		System.out.println(d2.square(10, 20));
		d1.draw();
	}

}
