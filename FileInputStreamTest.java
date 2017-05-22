import java.io.*;

public class FileInputStreamTest{
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("FileInputStreamTest.java");
		byte[] bbuf = new byte[200];
		int hasRead;
		while((hasRead = fis.read(bbuf)) > 0){
			System.out.println(hasRead);
			System.out.println(new String(bbuf, 0, hasRead));
		}
		fis.close();
	}
}