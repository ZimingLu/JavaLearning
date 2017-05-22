import java.io.*;

public class FileOutputStreamTest{
	public static void main(String[] args){
		try(FileInputStream fis = new FileInputStream("FileOutputStreamTest.java");
				FileOutputStream fos = new FileOutputStream("newFile.txt"))
		{
			byte[] bbuf = new byte[32];
			int hasRead;
			while((hasRead = fis.read(bbuf)) > 0){
				fos.write(bbuf, 0, hasRead);
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}