public class FinalVariableTest{
	final static int a;
	final static double b;
	static{
		a = 6;
		b = 5;
	}

	public static void main(String[] args){
		final double d = 1+2;
		System.out.println(d/2);
	}
}