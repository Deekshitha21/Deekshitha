import java.io.*;
public class ByteArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		FileOutputStream fout1=new FileOutputStream("D:\\f1.txt");
		FileOutputStream fout2=new FileOutputStream("D:\\f2.txt");
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		DataOutputStream dout=new DataOutputStream(fout1);
		dout.writeChar('c');
		dout.writeDouble(2.5);
		dout.writeInt(65);
		dout.writeBoolean(true);	
		byte[] b={'j','a','v','a'};
		bout.write(b);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		System.out.println("sucessfully inserted");
		System.out.println(bout.size());
		String s1=bout.toString();
		System.out.println(s1);
		String s2=	bout.toString(s1);
		System.out.println(s2);
		dout.close();
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			FileInputStream fin=new FileInputStream("D:\\f1.txt");
			DataInputStream din=new DataInputStream(fin);
			double a = din.readDouble(); 
            int b = din.readInt(); 
            boolean c = din.readBoolean(); 
            char d=din.readChar(); 
            System.out.println("Values: " + a + " " + b + " " + c+" " + d);
            din.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}