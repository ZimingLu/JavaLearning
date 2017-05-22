import java.net.*;
import java.io.*;

public class Client{
	public static void main(String[] args) throws IOException{
		Ask t1 = new Ask();
		Ask t2 = new Ask();
		new Thread(t1).start();
		new Thread(t2).start();
	}
}

class Ask implements Runnable{
	public void run(){
		try{
			int i=0;
			while(i<10){
				Socket s = new Socket("127.0.0.1", 30000);
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				String line = br.readLine();
				System.out.println("data from the server: " + line);
				i++;
				br.close();
				s.close();		
			}	
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}