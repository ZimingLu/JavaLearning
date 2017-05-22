class Person{
	public String name;
	public static int t = 0;
}

public class PersonTest{
	private int i = 9;
	public static void main(String[] args){
		PersonTest p = new PersonTest();
		p.fo();
	}

	private void fo(){
		int i;
		System.out.println(this.i);
	}
}