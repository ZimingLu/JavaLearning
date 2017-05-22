import java.io.*;

public class KeyinTest{
	public static void main(String[] args){
		try(InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(reader)){
			String line;
			while((line = br.readLine()) != null){
				if(line.equals("exit"))
					System.exit(1);
				System.out.println("the output is: " + line);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}