import java.io.*;

public class ReadObject{
	public static void main(String[] args) throws Exception{
		try(ObjectInputStream ois = new ObjectInputStream(
			new FileInputStream("Object.txt"))){
			Person per = (Person)ois.readObject();
			System.out.println(per);
		}
	}
}