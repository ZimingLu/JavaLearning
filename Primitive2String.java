public class Primitive2String{
	public static void main(String[] args){
		String intStr = "123";
		int it1 = Integer.parseInt(intStr);
		int it2 = new Integer(intStr);
		String str = String.valueOf(it1);
		String st = new String("Hello");
		st = "qqq";
		System.out.println(it1);
		System.out.println(it2);
		System.out.println(str instanceof String);
	}
}