import java.net.*;
import java.io.*;

public class Server{
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(30000);
		int i=0;
		while(true){
			Socket s = ss.accept();
			PrintStream ps = new PrintStream(s.getOutputStream());
			ps.println("the info from the server" + i);
			ps.close();
			s.close();
			i++;
		}
	}
}