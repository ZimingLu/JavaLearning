class Apple{
	@Deprecated
	public void info(){
		System.out.println("Apple the method");
	}
}

public class Fruit{
	public static void main(String[] args){
		new Apple().info();
	}
}