import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class BufferInputOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			/*FileOutputStream fout=new FileOutputStream("D:\\buffer.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s="welcome java";
			byte[] b=s.getBytes();
			bout.write(b);
			System.out.println("file is inserted");*/
			FileInputStream fin2=new FileInputStream("D:\\fileout.txt");
			FileInputStream fin=new FileInputStream("D:\\buffer.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			System.out.println(bin.available());
			bin.skip(3);
			int i;
			while((i=bin.read())!=-1)
				System.out.print((char)i);
			SequenceInputStream sin=new SequenceInputStream(fin, fin2);
			int j;
			while((j=sin.read())!=-1)
			System.out.print((char)j);
			//bout.close();
			fin.close();
			fin2.close();
			sin.close();
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
		

	}

}
