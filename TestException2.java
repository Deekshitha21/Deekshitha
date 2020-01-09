public class TestException2 {
	void method1()throws ArithmeticException
	{
		throw new ArithmeticException("exception caught");
	}
	void method2()throws ArithmeticException 
	{
		method1();
	}
	void method3(){
		try{
			method2();
			
		}
		catch(Exception e)
		{
			System.out.println("exception caught by catch block");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestException2 obj=new TestException2();
		obj.method3();

	}

}
