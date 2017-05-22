import java.net.*;

public class InetAddressTest{
	public static void main(String[] args) throws Exception{
		InetAddress ip = InetAddress.getByName("www.google.de");
		System.out.println("google is reachable or not: " + ip.isReachable(2000));

		System.out.println(ip.getHostAddress());
		InetAddress local = InetAddress.getByAddress(new byte[]{127, 0, 0, 1});
		System.out.println("host is reachable or not: " + local.isReachable(5000));
		System.out.println(local.getCanonicalHostName());
	}
}