class Root{
	static{
		System.out.println("Root static");
	}

	{
		System.out.println("Root normal");
	}

	public Root(){
		System.out.println("Root without parameters");
	}
}

class Mid extends Root{
	static{
		System.out.println("Mid static");
	}

	{
		System.out.println("Mid normal");
	}

	public Mid(){
		System.out.println("Mid without parameters");
	}

	public Mid(String msg){
		this();
		System.out.println("Mid with parameter" + msg);
	}
}

class Leaf extends Mid{
	static{
		System.out.println("Leaf static");
	}

	{
		System.out.println("Leaf normal");
	}

	public Leaf(){
		super("Hello");
		System.out.println("Leaf without parameters");
	}

}

public class Test{
	public static void main(String[] args){
		new Leaf();
		new Leaf();
	}
}