import java.io.*;
import java.net.*;
import java.util.*;

public class MyServer{
	public static List<Socket> allSocket = Collections.synchronizedList(new ArrayList<>());
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(30000);
		while(true){
			Socket s = ss.accept();
			new Thread(new ServerThread(s)).start();
		}
	}
}

class ServerThread implements Runnable{
	private Socket s = null;
	private BufferedReader br = null;
	public ServerThread(Socket s) throws IOException{
		this.s = s;
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
	public void run(){
		try{
		MyServer.allSocket.add(s);
		String line = null;
		while((line = br.readLine())!=null){
			for(Socket s : MyServer.allSocket){
				if(!s.equals(this.s)){
					PrintStream ps = new PrintStream(s.getOutputStream());
					ps.println(line);
				}
			}
		}
		}catch(Exception e){
			MyServer.allSocket.remove(s);
		}	
	}

}