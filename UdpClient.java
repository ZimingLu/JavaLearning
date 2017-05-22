import java.io.*;
import java.net.*;
import java.util.*;

public class UdpClient{
	public static final int DEST_PORT = 30000;
	public static final String DEST_IP = "127.0.0.1";
	private static final int DATA_LEN = 4096;
	byte[] inBuff = new byte[DATA_LEN];
	private DatagramPacket inPacket = new DatagramPacket(
		inBuff, inBuff.length);
	private DatagramPacket outPacket = null;
	public void init() throws IOException{
		try(DatagramSocket socket = new DatagramSocket()){
			outPacket = new DatagramPacket(
				new byte[0], 0, InetAddress.getByName(DEST_IP), DEST_PORT);
			Scanner scan = new Scanner(System.in);
			while(scan.hasNextLine()){
				byte[] buff = scan.nextLine().getBytes();
				outPacket.setData(buff);
				socket.send(outPacket);
				socket.receive(inPacket);
				System.out.println(new String(inBuff, 0 , inPacket.getLength()));
			}
		}
	}

	public static void main(String[] args) throws IOException{
		new UdpClient().init();
	}

}