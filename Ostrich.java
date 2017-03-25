public class Ostrich extends Bird{
	public void info(){
		System.out.println("I cannot fly");
	}

	public static void main(String[] args){
		Ostrich os = new Ostrich();
		os.info();
	}
}