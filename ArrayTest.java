
public class ArrayTest{
	private static Object[] obj = new Object[]{"hello", "world"};

	public static void main(String[] args){
		for(Object s : obj)
			System.out.println(s);
	}
}