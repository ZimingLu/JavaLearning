import java.io.*;

public class WriteObject{
	public static void main(String[] args){
		try(ObjectOutputStream oos = new ObjectOutputStream(
			new FileOutputStream("Object.txt"))){
			Person per = new Person("haha", 20);
			oos.writeObject(per);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}