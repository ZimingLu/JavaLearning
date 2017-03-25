import edu.princeton.cs.algs4.*;

public class StackSelf<Item>
{
	private int N;
	private Item[] a;

	public StackSelf(int cap){
		a = (Item[]) new Object[cap];
	}

	public int size(){ return N; }
	public boolean isEmpty() { return N==0; }
	public void push(Item t){
		a[N++] = t;
	}
	public Item pop(){
		return a[--N];
	}

	public static void main(String[] args){
		StackSelf<String> s;
		s = new StackSelf<String>(100);
		while(!StdIn.isEmpty()){
			String t = StdIn.readString();
			if(!t.equals("-"))
				s.push(t);
			else if(!s.isEmpty())
				StdOut.print(s.pop() + " ");
		}
		StdOut.println("(" + s.size() + ") left in stack");
	}
}