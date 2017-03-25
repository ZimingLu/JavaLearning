import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class ex1119
{
	public static long F(int N)
	{
		int[] a=new int[100];
		if(N==0) return 0;
		a[0] = 0;
		if(N==1) return 1;
		a[1] = 1;
		for(int n=2; n<=N; n++)
			a[n]=a[n-1]+a[n-2];
		return a[N];
	}

	public static void main(String[] args) 
	{
		for(int N=0; N<100; N++)
			StdOut.println(N + " " + F(N));
		// StdOut.println(F(30));
	}
}
