import edu.princeton.cs.algs4.*;

public class LazyPrimMST{
	private boolean[] marked;
	private Queue<Edge> mst;
	private MinPQ<Edge> pq;
	private double weight=0;

	public LazyPrimMST(EdgeWeightedGraph G){
		pq = new MinPQ<Edge>();
		marked = new boolean[G.V()];
		mst = new Queue<Edge>();

		visit(G, 0);
		while(!pq.isEmpty()){
			Edge e = pq.delMin();
			int v = e.either(), w = e.other(v);
			if(marked[v] && marked[w]) continue;
			mst.enqueue(e);
			weight += e.weight();
			if(!marked[v]) visit(G, v);
			if(!marked[w]) visit(G, w);
		}

	}

	public void visit(EdgeWeightedGraph G, int v){
		marked[v] = true;
		for(Edge e : G.adj(v)){
			if(!marked[e.other(v)]) pq.insert(e);
		}
	}

	public Iterable<Edge> edges(){
		return mst;
	}

	public double weight(){
		return weight;
	}

	public static void main(String[] args){
		In in = new In(args[0]);
		EdgeWeightedGraph G;
		G = new EdgeWeightedGraph(in);

		LazyPrimMST mst = new LazyPrimMST(G);
		for(Edge e : mst.edges())
			StdOut.println(e);
		StdOut.println(mst.weight());

	}
}