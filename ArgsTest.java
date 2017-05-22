public class ArgsTest{
	public static void main(String[] args){
		System.out.println(args[0]);
		for(String s : args)
			System.out.println(s);
	}
}