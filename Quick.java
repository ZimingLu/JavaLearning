import edu.princeton.cs.algs4.*;

public class Quick{
	public static void sort(Comparable[] a){
		sort(a, 0, a.length-1);
	}

	private static void sort(Comparable[] a,int lo,int hi){
		if(lo >= hi) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}

	private static int partition(Comparable[] a,int lo,int hi){
		Comparable v = a[lo];
		int i=lo, j=hi+1;
		while(true){
			while(less(a[++i], v)) if(i == hi) break;
			while(less(v, a[--j])) if(j == lo) break;
			if(i >= j) break;
			exch(a, i, j);
		} 
		exch(a, lo, j);
		return j;
	}

	private static boolean less(Comparable a, Comparable b){
		return a.compareTo(b) < 0;
	}

	private static void exch(Comparable[] a, int i, int j){
		Comparable v = a[i];
		a[i] = a[j];
		a[j] = v;
	}

	private static boolean isSorted(Comparable[] a){
		for(int i=1; i<a.length; i++){
			if(less(a[i], a[i-1])) return false;
		}
		return true;
	}

	private static void show(Comparable[] a){
		for(int i=0; i<a.length; i++){
			StdOut.print(a[i] + " ");
		}
		StdOut.print();
	}

	public static void main(String[] args){
		String[] a = In.readStrings();
		sort(a);
		assert isSorted(a);
		show(a);
	}
}