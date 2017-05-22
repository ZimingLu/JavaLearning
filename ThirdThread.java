import java.util.concurrent.*;

public class ThirdThread{
	public static void main(String[] args){
		ThirdThread rt = new ThirdThread();
		FutureTask<Integer> task = new FutureTask<>((Callable<Integer>)() ->{
			int i=0; 
			for( ; i< 100; i++){
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
			return i;
		});
		for(int i=0; i<100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				new Thread(task, "thread with return value").start();
			}
		}
		try{
			System.out.println("return value" + task.get());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}