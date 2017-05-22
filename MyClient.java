import java.io.*;
import java.net.*;

public class MyClient{
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("127.0.0.1", 30000);
		new Thread(new ClientThread(s)).start();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps = new PrintStream(s.getOutputStream());
		String line = null;
		while((line = br.readLine()) != null){
			ps.println(line);
		}
	}
}

class ClientThread implements Runnable{
	private Socket s = null;
	private BufferedReader br = null;

	public ClientThread(Socket s) throws Exception{
		this.s = s;
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	}

	public void run(){
		try{
				String content = null;
				while((content = br.readLine()) != null){
				System.out.println(content);
			}			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}