class Parent{
	public int a = 1;
}

class SubClass extends Parent{
	public int a = 2;
}

public class HideTest extends SubClass{
	public int a = super.a;
	public static void main(String[] args){
		HideTest h = new HideTest();
		System.out.println(h.a);
	}
}