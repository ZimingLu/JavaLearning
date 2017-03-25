import edu.princeton.cs.algs4.*;

public class FixesCapacityStackOfStrings{
	private String[] a;
	private int N;

	public FixesCapacityStackOfStrings(int n){
		a = new String[n];
	}
	public boolean isEmpty() { return N == 0; }
	public int size() { return N; }

	public void push(String item){
		a[N++] = item;
	}

	public String pop(){
		return a[--N];
	}

	public static void main(String[] args){
			FixesCapacityStackOfStrings s;
			s = new FixesCapacityStackOfStrings(100);
			StdOut.println(s.size());
			while(!StdIn.isEmpty()){
				String item = StdIn.readString();
			if(!item.equals("-"))
				s.push(item);
			else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
		}
		StdOut.println("(" + s.size() + "left on the stack");

	}
}