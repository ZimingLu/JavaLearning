import java.io.*;

public class FileWriterTest{
	public static void main(String[] args){
		try(FileWriter fw = new FileWriter("chinese_poem.txt")){
			fw.write("哈哈哈哈哈哈！\n");
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}