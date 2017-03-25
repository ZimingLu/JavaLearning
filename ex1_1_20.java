import edu.princeton.cs.algs4.*;

public class ex1_1_20
{
	public static int N(int n)
	{
		if(n==1) return 1;
		return n*N(n-1);
	}

	public static void main(String[] args)
	{
		StdOut.println(N(5));
	}
}