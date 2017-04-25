import edu.princeton.cs.algs4.*;

public class BST<Key extends Comparable<Key>, Value>{
	private Node root;
	private class Node{
		private Key key;
		private Value val;
		private Node left, right;
		private int N;
		public Node(Key key, Value val. int N){
			this.key = key;
			this.value = val;
			this.N = N;
		}
	}

	public int size(){
		return size(root);
	}

	public int size(Node x){
		if(x == null) return 0;
		else 	      return x.N;
	}

	public Value get(Key key){
		return get(root, key);
	}

	public Value(Node x, Key key){
		if(x == null) return null;
		int cmp = key.compareTo(x.key);
		if(cmp > 0) return get(x.right, key);
		else if(cmp < 0) return get(x.left, key);
		else return x.val;
	}

	public void put(){
		root = put(root, key, val);
	}

	public void put(Node x, Key key, Value val){
		if(x == null) return new Node(key, val, 1);
		int cmp = key.compareTo(x.key);
		if(cmp > 0) put(x.right, key, val);
		else if(cmp < 0) put(x.left, key, val);
		else x.val = val;
		x.N = size(x.left) + size(x.right) + 1;
		return x;
	} 
}