import java.io.*;

public class DivTest{
	public static void main(String[] args){
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("a.txt");
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
			return;
		}
		finally{
			if(fis != null){
				try{
					fis.close();
				}catch(IOException ioe){
					ioe.printStackTrace();
				}
			}
			System.out.println("recycle resources");
		}
		// catch(NumberFormatException ne){
		// 	System.out.println("Number format wrong");
		// }

	}
}