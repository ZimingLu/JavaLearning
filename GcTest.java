public class GcTest{
	public static void main(String[] args){
		for(int i=0; i<4;i++){
			new GcTest();
			Runtime.getRuntime().gc();
		}
	}

	public void finalize(){
		System.out.println("doing nothing!");
	}
}