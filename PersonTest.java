package Lu;
class Person{
	public String name;
	public static int eyeNum;
}

public class PersonTest{
	public static void main(String[] args){
		System.out.println("Person eyeNum is " + Person.eyeNum);
		Person p = new Person();
		p.name = "123";
		p.eyeNum = 4;
		System.out.println("Person eyeNum is " + p.eyeNum);
		Person p2 = new Person();
		System.out.println("Person eyeNum is " + p2.eyeNum);
	}
}