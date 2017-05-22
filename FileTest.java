import java.io.*;

public class FileTest{
	public static void main(String[] args) throws IOException{
		File file = new File(".");
		System.out.println(file.getName());		
		System.out.println(file.getParent());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsoluteFile().getParent());
		System.out.println(file.exists());
	}
}