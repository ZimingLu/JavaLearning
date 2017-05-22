import java.io.*;

public class ReadFromProcess{
	public static void main(String[] args) throws IOException{
		Process p = Runtime.getRuntime().exec("javac");
		try(BufferedReader bf = new BufferedReader(new InputStreamReader(p.getErrorStream()))){
			String buff;
			while((buff = bf.readLine())!=null)
				System.out.println(buff);
		}
	}
}