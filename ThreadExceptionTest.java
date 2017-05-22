public class ThreadExceptionTest implements Runnable{
	public void run(){
		firstMethod();
	}

	public void firstMethod(){
		secondMethod();
	}

	public void secondMethod(){
		int a = 1/0;
	}

	public static void main(String[] args){
		new Thread(new ThreadExceptionTest()).start();
	}
}