import edu.princeton.cs.algs4.*;

public class QueueTest{
	public static void main(String[] args){
		Queue<Integer> q = new Queue<Integer>();
		while(!StdIn.isEmpty()){
			q.enqueue(StdIn.readInt());
		}

		int N = q.size();
		int[] a = new int[N];
		for(int i=0; i<N; i++){
			a[i] = q.dequeue();
			StdOut.println(a[i]);
		}
	}
}