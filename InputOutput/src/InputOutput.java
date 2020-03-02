import java.io.FileInputStream;
import java.io.FileOutputStream;


public class InputOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fout=new FileOutputStream("D:\\fileout.txt");
			String s="Welcome to java language";
			byte[] b=s.getBytes();
			fout.write(b);
			System.out.println("file created successfully");
			FileInputStream fin=new FileInputStream("D:\\fileout.txt");
			int r=0;
			while((r=fin.read())!=-1)
			{
				System.out.print((char)r);
			}
			fout.close();
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
