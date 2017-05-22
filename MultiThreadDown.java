import java.io.*;
import java.net.*;

public class MultiThreadDown{
	public static void main(String[] args) throws Exception{
		final DownUtil downUtil = new DownUtil("http://www.crazyit.org/"
				+ "attachment.php?aid=MTY0NXxjNjBiYzNjN3wxMzE1NTQ2MjU5fGNhO"
				+ "DlKVmpXVmhpNGlkWmVzR2JZbnluZWpqSllOd3JzckdodXJOMUpOWWt0aTJz,"
				, "oracelsql.rar", 10);
		downUtil.download();
		new Thread(() -> {
			while(downUtil.getCompleteRate() < 1){
				System.out.println("already finished: " + downUtil.getCompleteRate());
				try{
					Thread.sleep(1000);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}).start();
	}
}