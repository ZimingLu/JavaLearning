public class Dog{
	public void run(){
		System.out.print("hello ");
		Dog dog = new Dog();
		dog.run();
	}

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.run();
	}
}