 import java.io.*;

 public class PrintStreamTest{
 	public static void main(String[] args){
 		try(FileOutputStream fos = new FileOutputStream("test.txt");
 			PrintStream ps = new PrintStream(fos))
 		{
 			ps.println("normal string");
 			ps.println(new PrintStreamTest());
 		}catch(IOException e){
 			e.printStackTrace();
 		}
 	}
 }