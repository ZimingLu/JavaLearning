public class ThisInConstructor{
	public int foo;
	public ThisInConstructor(){
		int foo = 0;
		this.foo = 20;
		System.out.print(foo);
	}
	public static void main(String[] args){
		ThisInConstructor t = new ThisInConstructor();
		System.out.print(t.foo);
	}
}