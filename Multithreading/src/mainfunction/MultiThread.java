package mainfunction;
public class MultiThread extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(500);
			}
		catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		System.out.println(i);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
