import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class WriterReaderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		FileWriter fw=new FileWriter("D:\\java.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Java is platform independent");
		System.out.println("File inserted");
		FileReader fr=new FileReader("D:\\java.txt");
		BufferedReader br=new BufferedReader(fr);
		int i=0;
		while((i=br.read())!=-1)
		{
			System.out.print((char)i);
		}
		fw.close();
		fr.close();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}
