import edu.princeton.cs.algs4.*;

public class Stack<Item>
{
	private Node first;
	private int N;

	private class Node{
		Item item;
		Node node;
	}

	public boolean isEmpty() { return N==0; }
	public int size() { return N; }

	public void push(Item item){
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.node = oldfirst;
		N++;
	}

	public Item pop(){
		Item popItem = first.item;
		first = first.node;
		N--;
		return popItem;
	}

	public static void main(String[] args){
		Stack<String> s = new Stack<String>();

		while(!StdIn.isEmpty()){
			String item = StdIn.readString();
			if(!item.equals("-"))
				s.push(item);
			else if(!s.isEmpty()) StdOut.print(s.pop() + " ");
		}
		StdOut.println("(" + s.size() + " left on Stack)");
	}
}